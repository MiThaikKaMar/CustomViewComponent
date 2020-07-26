package com.padcmyanmar.padcx.customviewassignment.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.padcmyanmar.padcx.customviewassignment.R
import com.padcmyanmar.padcx.customviewassignment.mvp.presenters.TaskPresenter
import com.padcmyanmar.padcx.customviewassignment.mvp.presenters.TaskPresenterImpl
import com.padcmyanmar.padcx.customviewassignment.mvp.views.TaskView
import kotlinx.android.synthetic.main.activity_task.*

class TaskActivity : AppCompatActivity() ,TaskView {


    private lateinit var mTaskPresenter : TaskPresenter

    companion object{
        fun newIntent(context: Context) : Intent{
            val intent = Intent(context,TaskActivity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task)

        setUpTaskPresenter()
        setUpUserAction()

        mTaskPresenter.onCreate()

    }

    override fun onStart() {
        super.onStart()
        mTaskPresenter.onStart()
    }

    override fun onResume() {
        super.onResume()
        mTaskPresenter.onResume()
    }

    override fun onPause() {
        super.onPause()
        mTaskPresenter.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        mTaskPresenter.onDestroy()
    }


    fun setUpUserAction(){
        iv_arrow_left1.setOnClickListener{
            mTaskPresenter.onTapArrow()
        }
        iv_profile1.setOnClickListener {
            mTaskPresenter.onTapProfile()
        }
        iv_profile3.setOnClickListener {
            mTaskPresenter.onTapProfile()
        }
    }
    fun setUpTaskPresenter(){
        mTaskPresenter=TaskPresenterImpl()
        mTaskPresenter.initPresenter(this)
    }

    override fun finishTaskActivity() {
        finish()
    }

    override fun navigateToProfile() {
        startActivity(ProfileActivity.newIntent(this))
    }
}
