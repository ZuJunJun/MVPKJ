package com.june.mvpkj.j.login;

import android.view.View;
import android.widget.Toast;

import com.june.mvpkj.databinding.ActivityLoginJBinding;
import com.june.mvpkj.j.base.BaseActivity;

public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContract.View{

    private ActivityLoginJBinding binding;

    @Override
    protected LoginPresenter createPresenter() {
        return new LoginPresenter(this);
    }

    @Override
    protected View layout() {
        binding = ActivityLoginJBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    protected void init() {

    }

    @Override
    public void invalidLogin(String error) {
        Toast.makeText(this,error,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void successResponse() {

    }

    @Override
    public void errorResponse() {

    }
}