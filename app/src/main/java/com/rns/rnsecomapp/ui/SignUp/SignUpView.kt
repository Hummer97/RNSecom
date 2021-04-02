package com.rns.rnsecomapp.ui.SignUp

import com.rns.rnsecomapp.base.BaseView

interface SignUpView:BaseView {
    fun getUserRegistration(response: RegisteredUserData)
}