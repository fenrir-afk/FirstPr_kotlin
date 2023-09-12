package com.example.firstprkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class ThirdFragment : Fragment() {

    private lateinit var btnComeBack2: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_third, container, false)
        btnComeBack2 = view.findViewById(R.id.BtnComeBack2)
        btnComeBack2.setOnClickListener{
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView2, FirstFragment())
            transaction.addToBackStack(null)
            transaction.commit()
        }
        return view
    }


}