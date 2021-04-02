package com.rns.rnsecomapp.ui.dashboard
import com.google.gson.annotations.SerializedName


data class BannerDataClass(
    @SerializedName("banner")
    val banner: List<BannerList>?,
    @SerializedName("msg")
    val msg: String?,
    @SerializedName("status")
    val status: Int?
)

data class BannerList(
    @SerializedName("banner_link")
    val bannerLink: String?,
    @SerializedName("banner_name")
    val bannerName: String?,
    @SerializedName("banners_id")
    val bannersId: String?,
    @SerializedName("created_at")
    val createdAt: String?,
    @SerializedName("from")
    val from: Any?,
    @SerializedName("image")
    val image: String?,
    @SerializedName("location")
    val location: Any?,
    @SerializedName("page_name")
    val pageName: Any?,
    @SerializedName("show_on")
    val showOn: String?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("to")
    val to: Any?,
    @SerializedName("type")
    val type: Any?,
    @SerializedName("updated_at")
    val updatedAt: String?
)