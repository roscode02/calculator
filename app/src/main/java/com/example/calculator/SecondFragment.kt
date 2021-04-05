package com.example.calculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.calculator.databinding.ActivityMainBinding
import com.example.calculator.databinding.FragmentFirstBinding
import com.example.calculator.databinding.FragmentSecondBinding

class SecondFragment : Fragment(R.layout.fragment_second) {
   private lateinit var binding: FragmentSecondBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondBinding.bind(view)
    }
}