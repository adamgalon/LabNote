package com.example.labnote.ui.addnote

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.labnote.R
import com.example.labnote.databinding.AddNoteFragmentBinding

class AddNoteFragment : Fragment() {
    private var _binding: AddNoteFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = AddNoteFragmentBinding.inflate(inflater, container, false)
    return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}