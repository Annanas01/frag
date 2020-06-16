package com.example.frag

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PageAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager){
    //массив фрагментов
    private val fragmentList : MutableList<Fragment> = ArrayList()
    //массив заголовков
    private val titleList : MutableList<String> = ArrayList()
    //получение фрагмента
    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }
    //получение количества фрагментов
    override fun getCount(): Int {
        return  fragmentList.size
    }

    fun addFragment(fragment: Fragment, title:String){
        fragmentList.add(fragment)
        titleList.add(title)
    }

    //Получение заголовка
    override fun getPageTitle(position: Int): CharSequence? {
        return titleList[position]
    }
}

