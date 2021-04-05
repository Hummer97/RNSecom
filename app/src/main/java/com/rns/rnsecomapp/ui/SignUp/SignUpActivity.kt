package com.rns.rnsecomapp.ui.SignUp

import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bb.bigbrotheruser.base.BaseActivity
import com.google.android.material.snackbar.Snackbar
import com.rns.rnsecomapp.MainActivity
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.SharedPrefManager.SharedPrefManager
import com.rns.rnsecomapp.ui.LogIn.LoginActivity
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
            var name:String = sign_up_user_name.text.toString()
            var password:String = sign_up_password.text.toString()
            var confirm_password:String = sign_up_confirm_password.text.toString()
            var mobile_No:String = sign_up_mobile_no.text.toString()
            var email_id:String = sign_up_email.text.toString()

            if(validationChecked(name,password,confirm_password,mobile_No,email_id))
            {
                presenter!!.userRegistrationApiHit(name,email_id,password,mobile_No)
            }
        }

        //presenter!!.userRegistrationApiHit(user_name,email_id,password,mobile_no)

    }

    private fun validationChecked(name: String, password: String, confirmPassword: String, mobileNo: String, emailId: String): Boolean {
        val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
        if(name.isEmpty())
        {
            sign_up_user_error_txt.visibility = View.VISIBLE
            sign_up_user_error_txt.text = "*Please enter user name"
            return false
        }
        else if (mobileNo.isEmpty())
        {
            sign_up_user_error_txt.visibility = View.GONE
            sign_up_mobile_error_txt.visibility = View.VISIBLE
            sign_up_mobile_error_txt.text = "*Please enter user name"
            return false
        }
        else if(mobileNo.length < 10 || mobileNo.length>10)
        {
            sign_up_user_error_txt.visibility = View.GONE
            sign_up_mobile_error_txt.visibility = View.VISIBLE
            sign_up_mobile_error_txt.text = "*Mobile number should be 10 digits"
            return false
        }
        else if (emailId.isEmpty())
        {
            sign_up_mobile_error_txt.visibility = View.GONE
            sign_up_email_error_txt.visibility = View.VISIBLE
            sign_up_email_error_txt.text = "*Please Enter Email id"
            return false
        }
        else if (!emailId.matches(emailPattern.toRegex()))
        {
            sign_up_mobile_error_txt.visibility = View.GONE
            sign_up_email_error_txt.visibility = View.VISIBLE
            sign_up_email_error_txt.text = "*Please Enter Valid Email id"
            return false
        }
        else if (password.isEmpty())
        {
            sign_up_email_error_txt.visibility = View.GONE
            sign_up_password_error_txt.visibility = View.VISIBLE
            sign_up_password_error_txt.text = "*Please Enter Password"
            return false
        }
        else if(password.length<8)
        {
            sign_up_email_error_txt.visibility = View.GONE
            sign_up_password_error_txt.visibility = View.VISIBLE
            sign_up_password_error_txt.text = "*Please Enter at least 8 digits password "
            return false
        }
        else if(confirmPassword.isEmpty())
        {
            sign_up_password_error_txt.visibility = View.GONE
            sign_up_confirm_password_error_txt.visibility = View.VISIBLE
            sign_up_confirm_password_error_txt.text = "*Please Enter Confirm Password"
            return false
        }
        else if (!confirmPassword.equals(password))
        {
            sign_up_password_error_txt.visibility = View.GONE
            sign_up_confirm_password_error_txt.visibility = View.VISIBLE
            sign_up_confirm_password_error_txt.text = "*Confirm Password not match"
            return false
        }
        else
        {
            sign_up_confirm_password_error_txt.visibility = View.GONE
            return true
        }
    }

    override fun getUserRegistration(response: RegisteredUserData) {
        if (response.status==200)
        {
            Snackbar.make(sign_up_confirm_password,response.msg.toString(),Snackbar.LENGTH_LONG).show()

            var intent = Intent(SignUpActivity@this,LoginActivity::class.java)
            startActivity(intent)
        }
        else
        {
            Snackbar.make(sign_up_confirm_password,response.msg.toString(),Snackbar.LENGTH_LONG).show()
        }
    }
}