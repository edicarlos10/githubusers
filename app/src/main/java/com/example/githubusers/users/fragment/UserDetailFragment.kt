package com.example.githubusers.users.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.domain.base.Event
import com.example.domain.users.model.Users
import com.example.githubusers.R
import com.example.githubusers.databinding.FragmentUserDetailBinding
import com.example.githubusers.users.UsersViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class UserDetailFragment : Fragment() {

    private var login: String? = null
    private val usersViewModel: UsersViewModel by viewModel()
    private var _binding: FragmentUserDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        usersViewModel.userDetail.observe(this) { onDataDetail(it) }
        arguments?.let {
            login = it.getString(LOGIN)
        }
    }

    override fun onCreateView(
        inflator: LayoutInflater,
        container: ViewGroup?,
        savedInstance: Bundle?
    ): View {
        _binding = FragmentUserDetailBinding.inflate(inflator, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupToolbar()
    }

    private fun onDataDetail(userDetail: Users?) {
        userDetail?.let {
//            adapter.list = listOf(userDetail)
//            binding.rvUsers.adapter = adapter
        }
    }

    private fun onLoading(loading: Boolean?) {
        loading?.let {
            if (it) {
//                binding.pbMain.visibility = View.VISIBLE
//                binding.textError.visibility = View.GONE
//                binding.clList.visibility = View.GONE
            } else {
//                binding.pbMain.visibility = View.GONE
//            binding.clList.visibility = View.VISIBLE
            }
        }
    }

    private fun onError(error: Event.Error?) {
//        binding.textError.visibility = View.VISIBLE
//        binding.clList.visibility = View.GONE
        if (error == null)
            return
    }

    private fun setupToolbar() {
        binding.toolbar.apply {
            title = getString(R.string.label_toolbar_title)
            setNavigationOnClickListener {
                activity?.onBackPressedDispatcher?.onBackPressed()
            }
        }
    }

    companion object {
        private const val LOGIN = "login"

        fun newInstance(login: String, param2: String) =
            UserDetailFragment().apply {
                arguments = Bundle().apply {
                    putString(LOGIN, login)
                }
            }
    }
}