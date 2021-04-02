package com.rns.rnsecomapp.api
import com.rns.rnsecomapp.api.Constants
import com.rns.rnsecomapp.datamodel.UserData
import com.rns.rnsecomapp.ui.AllCategories.CategoriesModel
import com.rns.rnsecomapp.ui.ShopFront.ShopFrontModel
import com.rns.rnsecomapp.ui.SignUp.RegisteredUserData
import com.rns.rnsecomapp.ui.dashboard.BannerDataClass
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
//
    @GET(Constants.Partials.Category)
    fun category(): Observable<CategoriesModel>

    @GET(Constants.Partials.Banner)
    fun banner():Observable<BannerDataClass>

    @GET(Constants.Partials.Product_List)
    fun arrival():Observable<ShopFrontModel>

    @POST(Constants.Partials.Login)
    fun login(@Body param:HashMap<String,Any>):Observable<UserData>

    @POST(Constants.Partials.Registration)
    fun registration(@Body param: HashMap<String, Any>):Observable<RegisteredUserData>

//    @POST(Constants.Partials.GenrateOTP)
//    fun GenerateOtp(@Body params: HashMap<String, Any>):Observable<GenetareOtpResponseModel>
//
//    @POST(Constants.Partials.MyBooking)
//    fun getMyBooking(@Body params: HashMap<String, Any>):Observable<MyBookingModelList>
//
//    @POST(Constants.Partials.GetWalletData)
//    fun getWalletData(@Body params: HashMap<String, Any>):Observable<WalletDataModel>
//
//    @POST(Constants.Partials.GetTransacation)
//    fun getTransaction(@Body params: HashMap<String, Any>):Observable<TransactionListData>
//



}


