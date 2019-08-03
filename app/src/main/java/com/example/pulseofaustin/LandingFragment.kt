package com.example.pulseofaustin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_landing.*

class LandingFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_landing, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.logInButton).setOnClickListener {
            findNavController().navigate(R.id.action_landing_dest_to_login_dest)
        }
        createAccountButton.setOnClickListener {
            findNavController().navigate(R.id.action_landing_dest_to_createAccountFragment)
        }
    }
}