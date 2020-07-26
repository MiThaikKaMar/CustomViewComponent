package com.padcmyanmar.padcx.customviewassignment.mvp.presenters

import com.padcmyanmar.padcx.customviewassignment.mvp.views.MainView

interface MainPresenter : BasePresenter<MainView>{

    fun onTapProfile()
    fun onTapPlusSign()

}