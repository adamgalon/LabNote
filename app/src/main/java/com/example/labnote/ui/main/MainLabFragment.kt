package com.example.labnote.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.labnote.R

class MainLabFragment : Fragment() {

    companion object {
        fun newInstance() = MainLabFragment()
    }

    private lateinit var viewModelMain: MainLabViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_lab_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModelMain = ViewModelProvider(this).get(MainLabViewModel::class.java)
        // TODO: Use the ViewModel
    }

}