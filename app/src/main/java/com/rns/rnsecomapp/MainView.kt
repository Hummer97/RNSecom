package com.rns.rnsecomapp

import com.rns.rnsecomapp.base.BaseView
import com.rns.rnsecomapp.ui.MyBag.MyCartDataClass

interface MainView: BaseView {
    fun getMyCartResponse(response: MyCartDataClass)
}