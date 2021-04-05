package com.rns.rnsecomapp.api
import com.rns.rnsecomapp.api.Constants
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
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {
//
    @GET(Constants.Partials.Category)
    fun category(): Observable<CategoriesModel>

    @GET(Constants.Partials.Banner)
    fun banner():Observable<BannerDataClass>

    @GET(Constants.Partials.Product_List)
    fun arrival():Observable<ShopFrontModel>

    @POST(Constants.Partials.Login)
    fun login(@Body param:HashMap<String,Any>):Observable<UserDataClass>

    @POST(Constants.Partials.Registration)
    fun registration(@Body param: HashMap<String, Any>):Observable<RegisteredUserData>

    @POST(Constants.Partials.CategoryWise_Product_list)
    fun getCaregooryWiseProduct(@Body params: HashMap<String, Any>):Observable<CategoryWiseProductModel>
//
    @POST(Constants.Partials.Add_cart)
    fun addToCart(@Body params: HashMap<String, Any>):Observable<AddCartData>

    @GET(Constants.Partials.Product_Details)
    fun getProductDetails(@Query("product_id")product_id:String):Observable<ProductDetailsData>

    @POST(Constants.Partials.My_cart)
    fun getMyCartDetails(@Body params: HashMap<String, Any>):Observable<MyCartDataClass>

    @POST(Constants.Partials.Wish_list)
    fun getWishList(@Body params: HashMap<String, Any>):Observable<WishListData>

    @POST(Constants.Partials.Add_Wish_list)
    fun addWishList(@Body params: HashMap<String, Any>):Observable<AddWishListResponseData>

//    @POST(Constants.Partials.GetWalletData)
//    fun getWalletData(@Body params: HashMap<String, Any>):Observable<WalletDataModel>
//
//    @POST(Constants.Partials.GetTransacation)
//    fun getTransaction(@Body params: HashMap<String, Any>):Observable<TransactionListData>
//



}


