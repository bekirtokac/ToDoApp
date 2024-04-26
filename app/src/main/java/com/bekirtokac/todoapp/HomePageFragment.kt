package com.bekirtokac.todoapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.annotation.SuppressLint
import androidx.navigation.Navigation
import com.bekirtokac.todoapp.databinding.FragmentHomePageBinding



class HomePage : Fragment() {

    private lateinit var binding: FragmentHomePageBinding

    @SuppressLint("ResourceType")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomePageBinding.inflate(inflater, container, false)
        binding.button.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_homePage_to_firstPage)
        }
        return binding.root
    }


}
