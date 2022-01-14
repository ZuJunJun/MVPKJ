package com.june.mvpkj.k.login

import com.june.mvpkj.k.base.BaseView

/**
 *@CreateTime: 2022/1/14
 *@author: jjzhu
 */
interface LoginContract {

    interface Model {
        /**
         * 定义的接口名
         */
        fun login(userName: String, password: String)
    }

    interface View : BaseView {
        /**
         * 无效登录(不具备登录条件，无网、未输入用户名密码)
         */
        fun invalidLogin(error: String)
    }

    interface Presenter {
        /**
         * 登录操作
         */
        fun login(userName: String, password: String)
    }
}