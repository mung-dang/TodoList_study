package com.example.todolist_study.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.example.todolist_study.R
import com.example.todolist_study.adapters.TodoListViewAdapter
import com.example.todolist_study.adapters.TodoViewPagerAdapter
import com.example.todolist_study.datas.TodoData
import kotlinx.android.synthetic.main.todolist_fragment.*

class FragmentTodolist : Fragment() {

    val mTodolist = ArrayList<TodoData>()

    lateinit var mTodoAdapter: TodoListViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.todolist_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mTodoAdapter = TodoListViewAdapter(requireContext(), R.layout.todo_list_view, mTodolist)
        todoListView.adapter = mTodoAdapter
    }
}