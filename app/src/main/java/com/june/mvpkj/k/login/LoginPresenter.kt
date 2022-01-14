package com.june.mvpkj.k.login

import android.text.TextUtils
import com.june.mvpkj.k.base.BasePresenter

/**
 *@CreateTime: 2022/1/14
 *@author: jjzhu
 */
class LoginPresenter(view: LoginContract.View?) : BasePresenter<LoginContract.View>(view),
    LoginContract.Presenter {

    private val model = LoginModel()

    override fun login(userName: String, password: String) {
        if (!isViewAttached()) {
            return
        }
        if (TextUtils.isEmpty(userName) or TextUtils.isEmpty(password)) {
            view?.invalidLogin("用户名/密码不可为空!")
        }
        model.login(userName, password)
        //模拟登录OK
        view?.successResponse()
    }
}