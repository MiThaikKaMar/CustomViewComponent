package com.padcmyanmar.padcx.customviewassignment.mvp.presenters

import com.padcmyanmar.padcx.customviewassignment.mvp.views.ProfileView

class ProfilePresenterImpl : ProfilePresenter , AbstractBasePresenter<ProfileView>() {


    override fun onTapCrossButton() {
        mView?.finishActivity()
    }

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
}