package com.padcmyanmar.padcx.customviewassignment.activities

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.padcmyanmar.padcx.customviewassignment.R
import com.padcmyanmar.padcx.customviewassignment.adapters.TaskAdapter
import com.padcmyanmar.padcx.customviewassignment.mvp.presenters.MainPresenter
import com.padcmyanmar.padcx.customviewassignment.mvp.presenters.MainPresenterImpl
import com.padcmyanmar.padcx.customviewassignment.mvp.views.MainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() ,MainView {

    private lateinit var mPresenter : MainPresenter


    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setUpPresenter()
        setUpRecycleView()
        setUpNavigationToProfile()
        setUpNavigateToTask()
        setUpCircularProgressBar()
        mPresenter.onCreate()

    }

    fun setUpCircularProgressBar(){
        circularProgressbar.setProgress(65)
    }

    override fun onStart() {
        super.onStart()
        mPresenter.onStart()
    }

    override fun onResume() {
        super.onResume()
        mPresenter.onResume()
    }

    override fun onPause() {
        super.onPause()
        mPresenter.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.onDestroy()
    }

    fun setUpPresenter(){
        mPresenter=MainPresenterImpl()
        mPresenter.initPresenter(this)
    }

    override fun navigateToProfile() {
        startActivity(ProfileActivity.newIntent(this))
    }

    override fun navigateToTask() {
        startActivity(TaskActivity.newIntent(this))
    }

    private fun setUpRecycleView() {
        val taskAdapter = TaskAdapter()
        val linearLayout = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        rv_main.layoutManager = linearLayout
        rv_main.adapter = taskAdapter
    }

    private fun setUpNavigationToProfile(){
        iv_profile1.setOnClickListener {
            mPresenter.onTapProfile()
        }
        iv_profile2.setOnClickListener {
            mPresenter.onTapProfile()
        }
        iv_profile3.setOnClickListener {
            mPresenter.onTapProfile()
        }
    }
    private fun setUpNavigateToTask(){
        iv_plus.setOnClickListener {
            mPresenter.onTapPlusSign()
        }
    }

}

