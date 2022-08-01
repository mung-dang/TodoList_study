package com.example.todolist_study.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.todolist_study.datas.TodoData

class TodoListViewAdapter(
    val mContext: Context,
    val resId : Int,
    val mList : ArrayList<TodoData>
) : ArrayAdapter<TodoData>(mContext, resId, mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if (tempRow == null){
            tempRow = LayoutInflater.from(mContext).inflate(resId, null)
        }

        val row = tempRow!!

        val data = mList[position]

        return row
    }

}