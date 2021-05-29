package com.example.navigationcomapp1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationcomapp1.databinding.FragmentSettingBinding

class SettingFragment : Fragment() {

  lateinit var binding: FragmentSettingBinding
  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    // Inflate the layout for this fragment
    binding = FragmentSettingBinding.inflate(inflater, container, false)

    return binding.root
  }
}