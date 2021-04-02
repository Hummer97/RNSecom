package com.rns.rnsecomapp.ui.SignUp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bb.bigbrotheruser.base.BaseActivity
import com.rns.rnsecomapp.MainActivity
import com.rns.rnsecomapp.R
import kotlinx.android.synthetic.main.activity_sign_in.*
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : BaseActivity<SignUpView,SignUpPresenter>(),SignUpView {
    override fun getContentView(): Int {
        return R.layout.activity_sign_up
    }

    override fun getPresenterClass(): Class<SignUpPresenter> {
        return SignUpPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        sign_up_btn.setOnClickListener {
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }

        presenter!!.userRegistrationApiHit(user_name,email_id,password,mobile_no)

    }

    override fun getUserRegistration(response: RegisteredUserData) {

    }
}