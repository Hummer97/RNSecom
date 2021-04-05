package com.rns.rnsecomapp.api

class Constants {
    companion object {
        var DeviceName =""
        const val BASE_URL = "https://rnsinfotecherp.com/rnsecom/public/"
        var DeviceId: String = ""
        var HEADER_TOKEN = "Basic AR-AUG-ARST-BIZBR-2019OLLY"
        const val LOCATION_REQUEST = 1000
        const val GPS_REQUEST = 1

    }



 internal object Partials {
    const val Category = "api/categories"
    const val Banner = "api/banner"
    const val Product_List = "api/product-list"
    const val Login = "api/login"
    const val Registration = "api/register"
    const val CategoryWise_Product_list = "api/product-list-category"
    const val Add_cart ="api/add-to-cart"
    const val Product_Details = "api/product-detail"
    const val My_cart = "api/my-cart"
     const val Wish_list = "api/my-wishlist"
     const val Add_Wish_list = "api/add-to-wishlist"

 }


    internal object Keys {
        val clientMachineName ="ClientMachineName"
        const val Password = "Password"
        const val ClientIPAddress = "ClientIPAddress"
        const val Username = "Username"
        const val PastId="PastId"
        const val UpComingId="UpComingId"
        const val FacebookId = "FacebookId"
        const val GoogleId = "GoogleId"
        const val id ="ID"
        const val cat_id ="cat_id"
        const val quantity="quantity"
        const val product_id="product_id"
        const val user_id="user_id"



    }


}