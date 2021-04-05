package com.rns.rnsecomapp.ui.ProductDetails
import com.google.gson.annotations.SerializedName


data class AddCartData(
    @SerializedName("msg")
    val msg: String?,
    @SerializedName("product-list-category")
    val productListCategory: List<Any>?,
    @SerializedName("status")
    val status: Int?
)