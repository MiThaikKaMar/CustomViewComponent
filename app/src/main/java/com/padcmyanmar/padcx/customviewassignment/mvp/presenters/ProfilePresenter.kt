package com.padcmyanmar.padcx.customviewassignment.mvp.presenters

import com.padcmyanmar.padcx.customviewassignment.mvp.views.ProfileView

interface ProfilePresenter : BasePresenter<ProfileView> {
    fun onTapCrossButton()

}