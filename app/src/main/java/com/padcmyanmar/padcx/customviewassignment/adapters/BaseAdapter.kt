package com.padcmyanmar.padcx.customviewassignment.adapters

import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.padcx.customviewassignment.views.viewholders.BaseViewHolder

abstract class BaseAdapter<T : BaseViewHolder> : RecyclerView.Adapter<T>() {

    override fun getItemCount(): Int {
        return 8
    }

}