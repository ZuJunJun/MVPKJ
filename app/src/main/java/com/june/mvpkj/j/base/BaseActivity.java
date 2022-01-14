package com.june.mvpkj.j.base;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @CreateTime: 2022/1/14
 * @author: jjzhu
 */
public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {

    protected P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout());
        presenter = createPresenter();
        init();
    }

    protected abstract P createPresenter();

    protected abstract View layout();

    protected abstract void init();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
