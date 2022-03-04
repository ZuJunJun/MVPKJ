package com.june.mvpkj.j.main;

import com.june.mvpkj.j.base.BasePresenter;

public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter{

    private final MainModel model;

    public MainPresenter(MainContract.View view) {
        super(view);
        model = new MainModel();
    }
}
