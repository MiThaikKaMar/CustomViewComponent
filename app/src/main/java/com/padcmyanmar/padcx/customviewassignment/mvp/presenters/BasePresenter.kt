package com.padcmyanmar.padcx.customviewassignment.mvp.presenters

import com.padcmyanmar.padcx.customviewassignment.mvp.views.BaseView

interface BasePresenter<T : BaseView> {
    fun onCreate()
    fun onStart()
    fun onResume()
    fun onPause()
    fun onDestroy()
    fun initPresenter(view: T)
}