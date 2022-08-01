package com.example.todolist_study.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.todolist_study.fragments.FragmentGoal
import com.example.todolist_study.fragments.FragmentTodolist

class TodoViewPagerAdapter(
    fm : FragmentManager
) : FragmentPagerAdapter(fm) {
    override fun getCount() = 2

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FragmentTodolist()
            else -> FragmentGoal()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "TodoList"
            else -> "Goal"
        }
    }
}