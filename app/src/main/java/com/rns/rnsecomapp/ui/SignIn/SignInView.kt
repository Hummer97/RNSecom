package com.rns.rnsecomapp.ui.SignIn

import com.rns.rnsecomapp.base.BaseView
import com.rns.rnsecomapp.datamodel.UserData

interface SignInView:BaseView {
    fun getLoginResponse(response:UserData)
}