package com.example.frag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnMessage.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("message", edtMessage.text.toString())
            val thirdFragment = ThirtFragment()
            thirdFragment.arguments = bundle
            fragmentManager!!.beginTransaction().replace(
                R.id.frame, thirdFragment
            ).addToBackStack(null).commit()

        }
    }
}










