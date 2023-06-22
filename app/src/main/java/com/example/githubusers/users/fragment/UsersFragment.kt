package com.example.githubusers.users.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.domain.base.Event
import com.example.domain.users.model.Users
import com.example.githubusers.databinding.FragmentUsersBinding
import com.example.githubusers.extension.OnItemClickListener
import com.example.githubusers.extension.addOnItemClickListener
import com.example.githubusers.users.UsersViewModel
import com.example.githubusers.users.adapter.UsersAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class UsersFragment : Fragment() {
    companion object {
        fun newInstance(): UsersFragment {
            val args = Bundle().apply { }
            val fragment = UsersFragment()
            fragment.arguments = args
            return fragment
        }
    }

    private val usersViewModel: UsersViewModel by viewModel()
    private var _binding: FragmentUsersBinding? = null
    private val binding get() = _binding!!
    private val adapter: UsersAdapter by lazy { UsersAdapter() }

    override fun onCreate(savedInstance: Bundle?) {
        super.onCreate(savedInstance)
        usersViewModel.users.observe(this) { onData(it) }
        usersViewModel.userDetail.observe(this) { onDataDetail(it) }
        usersViewModel.error.observe(this) { onError(it) }
        usersViewModel.loading.observe(this) { onLoading(it) }
    }

    private fun onDataDetail(userDetail: Users?) {
        userDetail?.let {
            adapter.list = listOf(userDetail)
            binding.rvUsers.adapter = adapter
        }
    }

    override fun onCreateView(
        inflator: LayoutInflater,
        container: ViewGroup?,
        savedInstance: Bundle?
    ): View {
        _binding = FragmentUsersBinding.inflate(inflator, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        usersViewModel.getUsers()

        setupListener()
    }

    private fun setupListener() {
        binding.textError.setOnClickListener {
            usersViewModel.getUsers()
        }

        binding.tlSearch.setEndIconOnClickListener {
            val name = binding.inputSearch.text.toString().trim()
            if (name.isEmpty()) {
                usersViewModel.getUsers()
            } else {
                usersViewModel.getUserDetail(name)
            }
        }
    }

    private fun onData(users: List<Users>?) {
        users.let {
            if (it != null) {
                setupRecycleView(it)
            }
        }
    }

    private fun setupRecycleView(it: List<Users>) {
        binding.rvUsers.layoutManager = LinearLayoutManager(activity)
        binding.rvUsers.setHasFixedSize(true)
        adapter.list = it
        binding.rvUsers.adapter = adapter
        binding.rvUsers.addOnItemClickListener(object : OnItemClickListener {
            override fun onItemClicked(position: Int, view: View) {

            }
        })
    }

    private fun onLoading(loading: Boolean?) {
        loading?.let {
            if (it) {
                binding.pbMain.visibility = View.VISIBLE
                binding.textError.visibility = View.GONE
                binding.clList.visibility = View.GONE
            } else
                binding.pbMain.visibility = View.GONE
            binding.clList.visibility = View.VISIBLE
        }
    }

    private fun onError(error: Event.Error?) {
        binding.textError.visibility = View.VISIBLE
        binding.clList.visibility = View.GONE
        if (error == null)
            return
    }
}