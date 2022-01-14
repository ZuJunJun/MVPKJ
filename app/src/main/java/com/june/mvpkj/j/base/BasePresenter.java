package com.june.mvpkj.j.base;

/**
 * @CreateTime: 2022/1/14
 * @author: jjzhu
 */
public class BasePresenter<V extends BaseView> {
    public V view;

    public BasePresenter(V view) {
        this.view = view;
    }

    public void detachView(){
        this.view = null;
    }

    public boolean isViewAttached(){
        return this.view != null;
    }
}
