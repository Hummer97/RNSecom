package com.rns.rnsecomapp.api

class Constants {
    companion object {
        var DeviceName =""
        const val BASE_URL = "http://devbox.bizbrolly.com:8915/api/"
        var DeviceId: String = ""
        var HEADER_TOKEN = "Basic AR-AUG-ARST-BIZBR-2019OLLY"
        const val LOCATION_REQUEST = 1000
        const val GPS_REQUEST = 1
    }




internal object Partials {
    const val SignUp = "Account/SignUp"
    const val Login = "Login/Login"
    const val Logout = "Login/LogOut"
    const val ForgetPass="Login/ForgetPassword"
    const val ResetPassword  =""
    const val VerifyOtp ="Login/VerifyOTP"
    const val GenrateOTP ="Login/GenrateOTP"
    const val MyBooking ="User/GetMyBookings"
    const val GetWalletData = "User/GetWalletDetails"
    const val GetTransacation = "User/GetTransactionList"


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