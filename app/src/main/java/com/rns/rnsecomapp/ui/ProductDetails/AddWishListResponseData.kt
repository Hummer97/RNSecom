package com.rns.rnsecomapp.ui.ProductDetails
import com.google.gson.annotations.SerializedName


data class AddWishListResponseData(
    @SerializedName("count")
    val count: Int?,
    @SerializedName("Item")
    val item: Item?,
    @SerializedName("msg")
    val msg: String?,
    @SerializedName("status")
    val status: Int?
)

data class Item(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("product_id")
    val productId: String?,
    @SerializedName("quantity")
    val quantity: String?,
    @SerializedName("type")
    val type: Any?,
    @SerializedName("user_id")
    val userId: String?
)