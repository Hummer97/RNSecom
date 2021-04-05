package com.rns.rnsecomapp.ui.MyBag

import com.rns.rnsecomapp.base.BaseView

interface MyBagView:BaseView {
    fun getMyCartResponse(response:MyCartDataClass)
}