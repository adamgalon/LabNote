package com.example.labnote.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.labnote.R
import com.example.labnote.databinding.MainLabFragmentBinding

class MainLabFragment : Fragment() {
    private var _binding: MainLabFragmentBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = MainLabFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnAdd.setOnClickListener {
            it.findNavController().navigate(R.id.action_mainLabFragment_to_addNoteFragment)
        }
        binding.btnAccess.setOnClickListener {
            it.findNavController().navigate(R.id.action_mainLabFragment_to_findNoteFragment)
        }
        binding.btnRecentlyAdded.setOnClickListener {
            it.findNavController().navigate(R.id.action_mainLabFragment_to_recentlyAddedFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
