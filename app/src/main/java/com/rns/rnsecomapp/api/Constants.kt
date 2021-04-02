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


    }


}