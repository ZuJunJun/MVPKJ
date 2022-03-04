package com.june.mvpkj.j.main;

import android.view.View;
import com.june.mvpkj.databinding.ActivityMainJBinding;
import com.june.mvpkj.j.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {

    private ActivityMainJBinding binding;

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected View layout() {
        binding = ActivityMainJBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    protected void init() {

    }

    @Override
    public void successResponse() {

    }

    @Override
    public void errorResponse() {

    }
}
