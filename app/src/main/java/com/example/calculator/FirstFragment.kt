package com.example.calculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.calculator.databinding.FragmentFirstBinding

class FirstFragment : Fragment(R.layout.fragment_first) {

    private lateinit var binding: FragmentFirstBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFirstBinding.bind(view)
        val thirdFragment = ThirdFragment()
        val fourFragment = FourFragment()
        requireFragmentManager().beginTransaction().apply {
            replace(R.id.flfragment, thirdFragment)
            commit()
        }
        binding.apply {


            circleButton.setOnClickListener {
                requireFragmentManager().beginTransaction().apply {
                    replace(R.id.flfragment, thirdFragment)
                    commit()
                }
            }
            coneButton.setOnClickListener {
                requireFragmentManager().beginTransaction().apply {
                    replace(R.id.flfragment, fourFragment)
                    commit()
                }
            }


            //Any new binding. should be written here
        }
    }
}