package com.rns.rnsecomapp.datamodel
import com.google.gson.annotations.SerializedName


data class UserData(
    @SerializedName("msg")
    val msg: String?,
    @SerializedName("status")
    val status: Int?,
    @SerializedName("user")
    val user: UserX?
)

data class UserX(
    @SerializedName("email")
    val email: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("phone")
    val phone: Any?,
    @SerializedName("user_type")
    val userType: String?
)