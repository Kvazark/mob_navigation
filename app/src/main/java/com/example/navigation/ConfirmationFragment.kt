package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class ConfirmationFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_confirmation, container, false)
        val confirm_button = view.findViewById<Button>(R.id.backMain)
        val number = arguments?.getString("number").toString()
        val amount = arguments?.getString("amount").toString()
        view.findViewById<TextView>(R.id.fin_text).text = "Номер:${number}; Сумма: ${amount}"
        confirm_button.setOnClickListener {
            findNavController().navigate(
                R.id.confirmationF_to_mainFragment,
                null
            )
        }
        // Inflate the layout for this fragment
        return view
    }
}