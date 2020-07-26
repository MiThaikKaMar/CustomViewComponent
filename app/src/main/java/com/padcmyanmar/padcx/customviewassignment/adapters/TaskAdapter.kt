package com.padcmyanmar.padcx.customviewassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.padcmyanmar.padcx.customviewassignment.R
import com.padcmyanmar.padcx.customviewassignment.views.viewholders.BaseViewHolder
import com.padcmyanmar.padcx.customviewassignment.views.viewholders.TaskViewHolder

class TaskAdapter : BaseAdapter<BaseViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_task,parent,false)
        return TaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {

    }
}