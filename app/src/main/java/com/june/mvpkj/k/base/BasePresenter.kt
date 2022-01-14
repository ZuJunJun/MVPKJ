package com.june.mvpkj.k.base

/**
 *@CreateTime: 2022/1/14
 *@author: jjzhu
 */
open class BasePresenter<V : BaseView>(protected var view: V?) {

    fun detachView(){
        this.view = null
    }

    fun isViewAttached(): Boolean{
        return this.view != null
    }
}