package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions



class MainFragment : Fragment() {

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        val history_button = view.findViewById<Button>(R.id.go_history)
        val balance_button = view.findViewById<Button>(R.id.go_balance)
        val payments_button = view.findViewById<Button>(R.id.go_payment)
        history_button.setOnClickListener {
            findNavController().navigate(
                R.id.mainF_to_historyFragment,
                null
            )
        }
        balance_button.setOnClickListener {
            findNavController().navigate(
                R.id.mainF_to_balanceFragment,
                null
            )
        }
        payments_button.setOnClickListener {
            findNavController().navigate(
                R.id.mainF_to_paymentsFragment,
                null
            )
        }

        return view
    }

}