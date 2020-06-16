package com.example.frag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.frag.FirstFragment
import com.example.frag.PageAdapter
import com.example.frag.SecondFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val adapter = PageAdapter(supportFragmentManager)
        
        adapter.addFragment(FirstFragment(), "Первый фрагмент")
        adapter.addFragment(SecondFragment(), "Второй фрагмент")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}

