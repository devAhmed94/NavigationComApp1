package com.example.navigationcomapp1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationcomapp1.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

  lateinit var binding: FragmentWelcomeBinding
  private val args: WelcomeFragmentArgs by navArgs()
  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    // Inflate the layout for this fragment
    binding = FragmentWelcomeBinding.inflate(inflater, container, false)
    with(binding) {
      tvUserName.text = args.userName
      tvPassword.text = args.password
      btnClose.setOnClickListener {
        val action = WelcomeFragmentDirections.actionWelcomeFragmentToFirstFragment()
        findNavController().navigate(action)
      }
    }
    return binding.root
  }
}