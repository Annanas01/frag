package com.example.frag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_thirt.*

class ThirtFragment : Fragment() {
    private lateinit var message : String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Получаем сообщение по ключу "message"
        message = arguments!!.getString("message").toString()

        return inflater.inflate(R.layout.fragment_thirt, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Отображаем сообщение в TextView "infoMessage"
        infoMessage.text = message
        //По нажатии на кнопку происходит возвращение на Фрагмент2
        btnBack.setOnClickListener { fragmentManager!!.popBackStack() }
    }
}

