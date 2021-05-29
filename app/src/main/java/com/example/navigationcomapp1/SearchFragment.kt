package com.example.navigationcomapp1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationcomapp1.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {

  lateinit var binding: FragmentSearchBinding

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    // Inflate the layout for this fragment
    binding = FragmentSearchBinding.inflate(inflater, container, false)
    return binding.root
  }
}