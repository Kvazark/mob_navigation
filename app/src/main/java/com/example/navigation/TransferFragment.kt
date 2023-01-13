package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
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
            val bundle = Bundle()
            val number = view.findViewById<EditText>(R.id.number).text.toString()
            val amount = view.findViewById<EditText>(R.id.amount).text.toString()
            bundle.putString("number", number)
            bundle.putString("amount", amount)
            findNavController().navigate(
                R.id.transferF_to_confirmationFragment,
                bundle
            )
        }
        return view
    }

}