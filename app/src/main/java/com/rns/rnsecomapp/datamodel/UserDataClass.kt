package com.rns.rnsecomapp.datamodel
import com.google.gson.annotations.SerializedName


data class UserDataClass(
    @SerializedName("msg")
    val msg: String?,
    @SerializedName("status")
    val status: Int?,
    @SerializedName("user")
    val user: UserData?
)
