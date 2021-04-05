package com.rns.rnsecomapp.ui.ProductDetails

import com.rns.rnsecomapp.base.BaseView
import okhttp3.ResponseBody

interface ProductDetailsView: BaseView {
    fun addToCart(responseBody: AddCartData)
    fun productDetails(responseBody: ProductDetailsData)
    fun addWishList(response:AddWishListResponseData)
}