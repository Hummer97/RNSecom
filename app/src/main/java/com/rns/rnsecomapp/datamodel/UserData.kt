package com.rns.rnsecomapp.datamodel

import com.google.gson.annotations.SerializedName


data class UserData(
        @SerializedName("email")
        val email: String?,
        @SerializedName("id")
        val id: Int?,
        @SerializedName("name")
        val name: String?,
//        @SerializedName("phone")
//        val phone: Any?,
        @SerializedName("user_type")
        val userType: String?
)
