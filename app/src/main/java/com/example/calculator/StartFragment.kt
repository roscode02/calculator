package com.example.calculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.Navigation
import com.example.calculator.databinding.FragmentStartBinding




class StartFragment : Fragment(R.layout.fragment_start) {
    private lateinit var binding: FragmentStartBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentStartBinding.bind(view)

        binding.apply {


            button1.setOnClickListener {
                Navigation.findNavController(view)
                    .navigate(R.id.action_startFragment2_to_firstFragment)

            }

            straightbutton.setOnClickListener {
                Navigation.findNavController(view)
                    .navigate(R.id.action_startFragment2_to_secondFragment)
            }


            //Any new binding. should be written here

        }
    }
}

