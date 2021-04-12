package com.example.calculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.calculator.databinding.FragmentThirdBinding


class ThirdFragment : Fragment(R.layout.fragment_third) {
    private lateinit var binding: FragmentThirdBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentThirdBinding.bind(view)

        binding.apply {

            enternum.setOnClickListener {
                var numtwo: Double
                var numone: Double = numone.text.toString().toDouble()
                numtwo = numone
                numone *= numone * (3.14)
                outputtextone.text = numone.toString()
                numtwo *= 2 * 3.14
                outputtexttwo.text = numtwo.toString()
            }

            //Any new binding. should be written here

        }
    }
}
