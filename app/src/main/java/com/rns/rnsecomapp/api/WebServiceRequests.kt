package com.rns.rnsecomapp.api

class WebServiceRequests {
    companion object {
        private var apiService: ApiService? = null
        val instance = WebServiceRequests()
    }



    init {
        if (apiService == null) {
            apiService = ApiClient.getClient()!!.create(ApiService::class.java)
        }
    }
//
//    fun Login(
//        clientIpAddress: String, clientMachineNumber: String, userName: String,
//        password: String, facebookId: String, googleId: String
//    ): Observable<LoginResponseModel> {
//        val params = HashMap<String, Any>()
//        params[Constants.Keys.ClientIPAddress] = Constants.DeviceId
//        params[Constants.Keys.clientMachineName] = Constants.DeviceName
//        params[Constants.Keys.Username] = userName
//        params[Constants.Keys.Password] = password
//        params[Constants.Keys.FacebookId] = facebookId
//        params[Constants.Keys.GoogleId] = googleId
//        return apiService!!.login(params)
//    }

}
