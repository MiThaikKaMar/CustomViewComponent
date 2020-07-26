package com.padcmyanmar.padcx.customviewassignment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.padcmyanmar.padcx.customviewassignment.R
import com.padcmyanmar.padcx.customviewassignment.adapters.TaskAdapter
import kotlinx.android.synthetic.main.fragment_tab.*

class TaskFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.fragment_tab,container,false)
        return view


    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        rv_tab.adapter=TaskAdapter()
        rv_tab.layoutManager=LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL ,false)
    }
}