package com.example.navigationcomapp1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationcomapp1.databinding.LoginFragmentBinding

class LoginFragment : Fragment() {

  lateinit var binding: LoginFragmentBinding
  private val args: LoginFragmentArgs by navArgs()
  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    // Inflate the layout for this fragment
    binding = LoginFragmentBinding.inflate(inflater, container, false)
    with(binding) {
      val username = args.username.toString()
      etUserName.setText(username)

      btnConform.setOnClickListener {
        val userName = etUserName.text.toString()
        val password = etPassword.text.toString()
        val action = LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(userName, password)
        findNavController().navigate(action)
      }

    }
    return binding.root
  }
}