package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class TransferFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_transfer, container, false)
        val transfer_button = view.findViewById<Button>(R.id.go_confirmation)
        transfer_button.setOnClickListener {
            findNavController().navigate(
                R.id.transferF_to_confirmationFragment,
                null
            )
        }
        return view
    }

}