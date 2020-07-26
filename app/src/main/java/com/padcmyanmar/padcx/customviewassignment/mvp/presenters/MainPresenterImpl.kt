package com.padcmyanmar.padcx.customviewassignment.mvp.presenters

import com.padcmyanmar.padcx.customviewassignment.mvp.views.MainView

class MainPresenterImpl : MainPresenter , AbstractBasePresenter<MainView>() {

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

    override fun onTapProfile() {
        mView?.navigateToProfile()
    }

    override fun onTapPlusSign() {
        mView?.navigateToTask()
    }
}