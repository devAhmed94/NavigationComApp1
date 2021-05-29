package com.example.navigationcomapp1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomapp1.databinding.FirstFragmentBinding

/**
 * Ahmed Ali Ebaid
 * ahmedali26002844@gmail.com
 * 29/05/2021
 */
class FirstFragment : Fragment() {

  lateinit var binding: FirstFragmentBinding
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    binding = FirstFragmentBinding.inflate(inflater, container, false)
    with(binding) {
      btnLogin.setOnClickListener {
        val action = FirstFragmentDirections.actionFirstFragmentToLoginFragment()
        findNavController().navigate(action)
      }
    }
    return binding.root
  }
}