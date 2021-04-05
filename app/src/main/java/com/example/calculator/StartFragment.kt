package com.example.calculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.calculator.databinding.FragmentStartBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


   class StartFragment : Fragment(R.layout.fragment_start){
     private lateinit var binding: FragmentStartBinding
      override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
         super.onViewCreated(view, savedInstanceState)
         binding = FragmentStartBinding.bind(view)

         binding.button1.setOnClickListener{
          Navigation.findNavController(view).navigate(R.id.action_startFragment2_to_firstFragment)

         }

         binding.straightbutton.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_startFragment2_to_secondFragment)
         }
      }
   }

