package com.june.mvpkj.k.main

import android.view.View
import com.june.mvpkj.databinding.ActivityMainBinding
import com.june.mvpkj.k.base.BaseActivity

class MainActivity : BaseActivity<MainContract.View,MainPresenter>(),MainContract.View {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun createPresenter(): MainPresenter {
        return MainPresenter(this)
    }

    override fun layout(): View {
        return binding.root
    }

    override fun init() {
        TODO("Not yet implemented")
    }

    override fun successResponse() {
        TODO("Not yet implemented")
    }

    override fun errorResponse() {
        TODO("Not yet implemented")
    }

}