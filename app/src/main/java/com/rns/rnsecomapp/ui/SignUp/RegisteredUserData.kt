package com.rns.rnsecomapp.ui.SignUp
import com.google.gson.annotations.SerializedName


data class RegisteredUserData(
    @SerializedName("msg")
    val msg: String?,
    @SerializedName("status")
    val status: Int?,
    @SerializedName("user")
    val user: User?
)

data class User(
    @SerializedName("address")
    val address: Any?,
    @SerializedName("address2")
    val address2: Any?,
    @SerializedName("city")
    val city: Any?,
    @SerializedName("consultation_fees")
    val consultationFees: Any?,
    @SerializedName("country")
    val country: Any?,
    @SerializedName("description")
    val description: Any?,
    @SerializedName("device_token")
    val deviceToken: Any?,
    @SerializedName("dob")
    val dob: Any?,
    @SerializedName("email")
    val email: String?,
    @SerializedName("gender")
    val gender: Any?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("image")
    val image: String?,
    @SerializedName("is_active")
    val isActive: String?,
    @SerializedName("is_block")
    val isBlock: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("number_of_consultation")
    val numberOfConsultation: Any?,
    @SerializedName("phone")
    val phone: String?,
    @SerializedName("pin_code")
    val pinCode: Any?,
    @SerializedName("refer_code")
    val referCode: Any?,
    @SerializedName("service")
    val service: Any?,
    @SerializedName("speciality")
    val speciality: Any?,
    @SerializedName("specialization")
    val specialization: Any?,
    @SerializedName("state")
    val state: Any?,
    @SerializedName("user_type")
    val userType: String?
)