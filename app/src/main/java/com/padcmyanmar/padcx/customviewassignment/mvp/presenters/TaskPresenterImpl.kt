package com.padcmyanmar.padcx.customviewassignment.mvp.presenters

import com.padcmyanmar.padcx.customviewassignment.mvp.views.TaskView

class TaskPresenterImpl : TaskPresenter ,AbstractBasePresenter<TaskView>() {


    override fun onCreate() {

    }

    override fun onStart() {

    }

    override fun onResume() {

    }

    override fun onPause() {

    }

    override fun onDestroy() {

    }

    override fun onTapArrow() {
        mView?.finishTaskActivity()
    }

    override fun onTapProfile() {
        mView?.navigateToProfile()
    }
}