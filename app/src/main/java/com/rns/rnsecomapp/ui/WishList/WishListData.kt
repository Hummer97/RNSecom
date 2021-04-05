package com.rns.rnsecomapp.ui.WishList
import com.google.gson.annotations.SerializedName


data class WishListData(
    @SerializedName("count")
    val count: Int?,
    @SerializedName("Item")
    val item: List<Item>?,
    @SerializedName("msg")
    val msg: String?,
    @SerializedName("status")
    val status: Int?
)

data class Item(
    @SerializedName("extra_discount")
    val extraDiscount: Any?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("price")
    val price: String?,
    @SerializedName("product_image")
    val productImage: String?,
    @SerializedName("product_name")
    val productName: String?,
    @SerializedName("products_id")
    val productsId: String?,
    @SerializedName("quantity")
    val quantity: String?,
    @SerializedName("special_price")
    val specialPrice: String?,
    @SerializedName("type")
    val type: String?
)