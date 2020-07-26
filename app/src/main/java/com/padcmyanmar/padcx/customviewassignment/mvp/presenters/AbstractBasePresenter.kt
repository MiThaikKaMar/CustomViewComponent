package com.padcmyanmar.padcx.customviewassignment.mvp.presenters

import com.padcmyanmar.padcx.customviewassignment.mvp.views.BaseView

abstract class AbstractBasePresenter<T : BaseView> : BasePresenter<T> {

    var mView : T? =null


    override fun initPresenter(view: T) {
        mView=view
    }
}