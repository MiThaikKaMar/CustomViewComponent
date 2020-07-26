package com.padcmyanmar.padcx.customviewassignment.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import com.google.android.material.tabs.TabLayoutMediator
import com.padcmyanmar.padcx.customviewassignment.R
import com.padcmyanmar.padcx.customviewassignment.adapters.TabPagerAdapter
import com.padcmyanmar.padcx.customviewassignment.mvp.presenters.ProfilePresenter
import com.padcmyanmar.padcx.customviewassignment.mvp.presenters.ProfilePresenterImpl
import com.padcmyanmar.padcx.customviewassignment.mvp.views.ProfileView
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() , ProfileView {

    private lateinit var mProfilePresenteer : ProfilePresenter


    companion object{
        fun newIntent(context: Context) : Intent{
            val intent = Intent(context,ProfileActivity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        setUpPresenter()
        setUpUserAction()
        setUpTabViewPager()

        mProfilePresenteer.onCreate()
    }

    override fun onStart() {
        super.onStart()
        mProfilePresenteer.onStart()
    }

    override fun onResume() {
        super.onResume()
        mProfilePresenteer.onResume()
    }

    override fun onPause() {
        super.onPause()
        mProfilePresenteer.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        mProfilePresenteer.onDestroy()
    }

    fun setUpUserAction(){
        iv_cross.setOnClickListener {
            mProfilePresenteer.onTapCrossButton()
        }
    }

    fun setUpPresenter(){
        mProfilePresenteer = ProfilePresenterImpl()
        mProfilePresenteer.initPresenter(this)
    }

    override fun finishActivity() {
        finish()
    }

    private fun setUpTabViewPager(){
        view_pager2.adapter=TabPagerAdapter(this)
        TabLayoutMediator(tab_layout,view_pager2){tab, position ->
            when(position){
                0 -> tab.text= "Project Tasks"
                1-> tab.text = "Contacts"
                2 -> tab.text = "About you"
            }
        }.attach()
    }
}
