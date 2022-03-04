package com.june.mvpkj.k.login

import android.content.Intent
import android.view.View
import android.widget.Toast
import com.june.mvpkj.R
import com.june.mvpkj.databinding.ActivityLoginBinding
import com.june.mvpkj.k.base.BaseActivity
import com.june.mvpkj.k.main.MainActivity

class LoginActivity : BaseActivity<LoginContract.View,LoginPresenter>(),LoginContract.View,
    View.OnClickListener {

    private val binding: ActivityLoginBinding by lazy { ActivityLoginBinding.inflate(layoutInflater) }

    override fun createPresenter(): LoginPresenter {
        return LoginPresenter(this)
    }

    override fun layout(): View {
        return binding.root
    }

    override fun init() {
        binding.loginTv.setOnClickListener(this)
    }

    override fun invalidLogin(error: String) {
        Toast.makeText(this,error,Toast.LENGTH_SHORT).show()
    }

    override fun successResponse() {
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

    override fun errorResponse() {
        TODO("Not yet implemented")
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.login_tv -> {
                presenter?.login(binding.usernameEt.text.toString(),binding.passwordEt.text.toString())
            }
        }
    }
}