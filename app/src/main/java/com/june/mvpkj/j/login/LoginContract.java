package com.june.mvpkj.j.login;

import com.june.mvpkj.j.base.BaseView;

/**
 * @CreateTime: 2022/1/14
 * @author: jjzhu
 */
public interface LoginContract {
    interface Model{
        void login(String username,String password);
    }

    interface View extends BaseView{
        void invalidLogin(String error);
    }

    interface Presenter{
        void login(String username , String password);
    }
}
