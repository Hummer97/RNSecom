package com.rns.rnsecomapp.api

import com.rns.rnsecomapp.datamodel.UserData
import com.rns.rnsecomapp.ui.AllCategories.CategoriesModel
import com.rns.rnsecomapp.ui.ShopFront.ShopFrontModel
import com.rns.rnsecomapp.ui.SignUp.RegisteredUserData
import com.rns.rnsecomapp.ui.dashboard.BannerDataClass
import io.reactivex.Observable

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

    fun categoary(): Observable<CategoriesModel> {
        return apiService!!.category()
    }

    fun banner(): Observable<BannerDataClass>
    {
        return apiService!!.banner()
    }
    fun arrival():Observable<ShopFrontModel>
    {
        return apiService!!.arrival()
    }

    fun login(user_name:String,password:String):Observable<UserData>
    {
        val param = HashMap<String,Any>()
        param.put("user_name",user_name)
        param.put("password",password)
        return apiService!!.login(param)
    }

    fun registration(user_name: String,email_id: String,password: String,mobile_no: String):Observable<RegisteredUserData>
    {
        val param = HashMap<String,Any>()
        param.put("name",user_name)
        param.put("email",email_id)
        param.put("password",password)
        param.put("phone",mobile_no)
        return apiService!!.registration(param)
    }

}
