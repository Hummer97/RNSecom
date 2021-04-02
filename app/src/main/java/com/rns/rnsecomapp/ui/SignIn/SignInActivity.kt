package com.rns.rnsecomapp.ui.SignIn

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.bb.bigbrotheruser.base.BaseActivity
import com.google.android.material.snackbar.Snackbar
import com.rns.rnsecomapp.MainActivity
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.datamodel.UserData
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : BaseActivity<SignInView, SignInPresenter>(),SignInView {
    override fun getContentView(): Int {
        return R.layout.activity_sign_in
    }

    override fun getPresenterClass(): Class<SignInPresenter> {
        return SignInPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        sign_in_btn.setOnClickListener {

            val userId:String = signIn_user_id.text.toString()
            val password:String = signIn_password.text.toString()
            if(checkValidation(userId, password))
            {
                presenter?.hitApi(userId, password)
            }

//            intent = Intent(applicationContext, MainActivity::class.java)
//            startActivity(intent)
        }

    }

    private fun checkValidation(userId: String, password: String): Boolean {
        val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
        if (userId.isEmpty())
        {
            signIn_userId_error_txt.visibility = View.VISIBLE
            signIn_userId_error_txt.text = "**Please Enter Registered Email ID"
            return false
        }
        else if(!userId.matches(emailPattern.toRegex()))
        {
            signIn_userId_error_txt.visibility = View.VISIBLE
            signIn_password_error_txt.visibility = View.GONE
            signIn_userId_error_txt.text = "**Please Enter Valid Mail ID"
            return false
        }
        else if(password.isEmpty())
        {
            signIn_userId_error_txt.visibility = View.GONE
            signIn_password_error_txt.visibility = View.VISIBLE
            signIn_password_error_txt.text = "**Please Enter Password"
            return false
        }
        else{
            signIn_userId_error_txt.visibility = View.GONE
            signIn_password_error_txt.visibility = View.GONE
            return true
        }

    }

    override fun getLoginResponse(response: UserData) {
        if(response.status == 200)
        {
            Snackbar.make(signIn_user_id,response.msg.toString(),Snackbar.LENGTH_LONG).show()
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
        else if(response.status == 400)
        {
            Snackbar.make(signIn_user_id,response.msg.toString(),Snackbar.LENGTH_LONG).show()
        }
        else
        {
            Snackbar.make(signIn_user_id,"Somethings went wrong!",Snackbar.LENGTH_LONG).show()
        }
    }
}