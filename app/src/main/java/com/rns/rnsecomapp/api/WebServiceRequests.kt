package com.rns.rnsecomapp.api

import com.rns.rnsecomapp.datamodel.CategoryWiseProductModel
import com.rns.rnsecomapp.datamodel.UserData
import com.rns.rnsecomapp.datamodel.UserDataClass
import com.rns.rnsecomapp.ui.AllCategories.CategoriesModel
import com.rns.rnsecomapp.ui.MyBag.MyCartDataClass
import com.rns.rnsecomapp.ui.ProductDetails.AddCartData
import com.rns.rnsecomapp.ui.ProductDetails.AddWishListResponseData
import com.rns.rnsecomapp.ui.ProductDetails.ProductDetailsData
import com.rns.rnsecomapp.ui.ShopFront.ShopFrontModel
import com.rns.rnsecomapp.ui.SignUp.RegisteredUserData
import com.rns.rnsecomapp.ui.WishList.WishListData
import com.rns.rnsecomapp.ui.dashboard.BannerDataClass
import io.reactivex.Observable
import okhttp3.ResponseBody
import java.security.Key

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

    fun login(user_name:String,password:String):Observable<UserDataClass>
    {
        val param = HashMap<String,Any>()
        param["user_name"]=user_name
        param["password"]=password
        return apiService!!.login(param)
    }

    fun registration(user_name: String,email_id: String,password: String,mobile_no: String):Observable<RegisteredUserData>
    {
        val param = HashMap<String,Any>()
        param["name"]=user_name
        param["email"]=email_id
        param["password"] =password
        param["phone"]=mobile_no
        return apiService!!.registration(param)
    }
    fun getCategoryWiseProduct(cat_id:String):Observable<CategoryWiseProductModel>{
        val param = HashMap<String,Any>()
        param[Constants.Keys.cat_id]=cat_id
        return apiService!!.getCaregooryWiseProduct(param)
    }

    fun addToCart(quantity:String,prductId:String,userid:String):Observable<AddCartData>{
        val param = HashMap<String,Any>()
        param[Constants.Keys.product_id]=prductId
        param[Constants.Keys.quantity]= quantity
        param[Constants.Keys.user_id]= userid
        return apiService!!.addToCart(param)
    }

    fun getProductDetails(id:String):Observable<ProductDetailsData>
    {

        return apiService!!.getProductDetails(id)
    }

    fun getMyCartDetails(id: String):Observable<MyCartDataClass>
    {
        val params = HashMap<String,Any>()
        params[Constants.Keys.user_id]=id
        return apiService!!.getMyCartDetails(params)
    }

    fun getWishList(id: String):Observable<WishListData>
    {
        val params = HashMap<String,Any>()
        params[Constants.Keys.user_id]=id
        return apiService!!.getWishList(params)
    }
    fun addWishList(quantity: String,product_id:String,user_id:String): Observable<AddWishListResponseData> {
        val params = HashMap<String,Any>()
        params[Constants.Keys.quantity]=quantity
        params[Constants.Keys.product_id]=product_id
        params[Constants.Keys.user_id] = user_id

        return apiService!!.addWishList(params)
    }
}
