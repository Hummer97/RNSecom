package com.rns.rnsecomapp.ui.WishList

import com.rns.rnsecomapp.base.BaseView

interface WishListView:BaseView {
    fun getWishListResponse(response: WishListData)
}