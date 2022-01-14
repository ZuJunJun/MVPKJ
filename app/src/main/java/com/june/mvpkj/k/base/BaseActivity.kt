package com.june.mvpkj.k.base

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

/**
 *@CreateTime: 2022/1/14
 *@author: jjzhu
 */
abstract class BaseActivity<V : BaseView ,P : BasePresenter<V>> : AppCompatActivity() {

    var presenter : P? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout())
        presenter = createPresenter()
        init()
    }

    abstract fun createPresenter() : P

    abstract fun layout(): View

    abstract fun init()

    override fun onDestroy() {
        super.onDestroy()
        presenter?.detachView()
    }
}