package com.example.firstprkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class FirstFragment : Fragment() {
    private lateinit var btnApi: Button
    private lateinit var btnHand: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_first, container, false)
        btnApi = view.findViewById(R.id.btnApi)
        btnHand = view.findViewById(R.id.btnHand)
        btnApi.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment)

        }
        btnHand.setOnClickListener{
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView2, ThirdFragment())
            transaction.addToBackStack(null)
            transaction.commit()
        }
        //btnHand = view.findViewById(R.id.btnH)
        return view
    }


}