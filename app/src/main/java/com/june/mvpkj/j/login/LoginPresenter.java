package com.june.mvpkj.j.login;

import android.text.TextUtils;
import com.june.mvpkj.j.base.BasePresenter;

/**
 * @CreateTime: 2022/1/14
 * @author: jjzhu
 */
public class LoginPresenter extends BasePresenter<LoginContract.View> implements LoginContract.Presenter{

    private final LoginModel model;

    public LoginPresenter(LoginContract.View view) {
        super(view);
        model = new LoginModel();
    }

    @Override
    public void login(String username, String password) {
        if (!isViewAttached()) {
            return;
        }
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
            view.invalidLogin("用户名/密码不可为空!");
        }
        model.login(username, password);
    }
}
