package com.rns.rnsecomapp.ui.LogIn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import com.bb.bigbrotheruser.base.BaseActivity
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.ui.SignIn.SignInActivity
import com.rns.rnsecomapp.ui.SignUp.SignUpActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity<LogInView,LogInPersenter>(),LogInView {
    override fun getContentView(): Int {
        return R.layout.activity_login
    }

    override fun getPresenterClass(): Class<LogInPersenter> {

        return LogInPersenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        supportActionBar?.hide()
        login_signin_btn.setOnClickListener {
            var intent = Intent(applicationContext,SignInActivity::class.java)
            startActivity(intent)
        }
        login_signup_btn.setOnClickListener {
            var intent = Intent(applicationContext,SignUpActivity::class.java)
            startActivity(intent)
        }
    }

}