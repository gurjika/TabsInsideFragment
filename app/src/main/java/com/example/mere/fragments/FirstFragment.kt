package com.example.mere.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mere.R

class FirstFragment: Fragment(R.layout.fragment_first) {
    private lateinit var editText:EditText
    private lateinit var button: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        editText = view.findViewById(R.id.editTextTextPersonName)
        button = view.findViewById(R.id.button)
        val saveArray = Array(2) { DoubleArray(2) }


    }
}