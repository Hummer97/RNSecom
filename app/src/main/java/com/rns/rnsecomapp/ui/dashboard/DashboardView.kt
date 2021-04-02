package com.rns.rnsecomapp.ui.dashboard

import com.rns.rnsecomapp.base.BaseView
import com.rns.rnsecomapp.ui.AllCategories.CategoriesModel
import com.rns.rnsecomapp.ui.ShopFront.ShopFrontModel

interface DashboardView:BaseView {
    fun getCategoriesResponse(response: CategoriesModel)
    fun getBannerResponse(response: BannerDataClass)
    fun getArrivalResponse(response: ShopFrontModel)

}