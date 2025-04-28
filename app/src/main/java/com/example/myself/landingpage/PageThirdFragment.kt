package com.example.myself.landingpage

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import com.example.myself.R
import com.example.myself.auth.AuthActivity
import com.example.myself.auth.login.LoginActivity

class PageThirdFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view  = inflater.inflate(R.layout.fragment_page_third, container, false)
        val button : Button = view.findViewById(R.id.buttonNext)
        val fadein = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
        button.startAnimation(fadein)
        button.setOnClickListener {
            val moveIntent = Intent(requireContext(), LoginActivity::class.java)
            // Set flags to clear the back stack so the user can't navigate back
            moveIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(moveIntent)
        }
        return view
    }

}