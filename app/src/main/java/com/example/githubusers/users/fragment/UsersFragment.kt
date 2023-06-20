package com.example.githubusers.users.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.domain.base.Event
import com.example.domain.users.model.Users
import com.example.githubusers.databinding.FragmentUsersBinding
import com.example.githubusers.users.UsersViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class UsersFragment : Fragment() {
    companion object{
        fun newInstance() : UsersFragment{
            val args = Bundle().apply {  }
            val fragment = UsersFragment()
            fragment.arguments = args
            return fragment
        }
    }

    private val usersViewModel: UsersViewModel by viewModel()
    private var _binding: FragmentUsersBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstance: Bundle?) {
        super.onCreate(savedInstance)
        usersViewModel.users.observe(this) { onData(it) }
        usersViewModel.error.observe(this) { onError(it) }
        usersViewModel.loading.observe(this) { onLoading(it) }
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
    }

    private fun onData(users: List<Users>?) {
        users.let {

        }
    }

    private fun onLoading(loading: Boolean?) {
        loading?.let {
            if (it) binding.textMain.visibility = View.GONE
            else
                binding.textMain.visibility = View.VISIBLE
        }
    }

    private fun onError(error: Event.Error?) {
        if (error == null)
            return
    }
}