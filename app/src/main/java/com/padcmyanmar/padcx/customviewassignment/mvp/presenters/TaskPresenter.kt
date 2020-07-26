package com.padcmyanmar.padcx.customviewassignment.mvp.presenters

import com.padcmyanmar.padcx.customviewassignment.mvp.views.TaskView

interface TaskPresenter : BasePresenter<TaskView>{

    fun onTapArrow()
    fun onTapProfile()
}