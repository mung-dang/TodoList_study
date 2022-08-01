package com.example.todolist_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.todolist_study.adapters.TodoViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var  mPagerAdapter: TodoViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPagerAdapter = TodoViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mPagerAdapter
        mainTabLayout.setupWithViewPager(mainViewPager)
    }
}