package com.rns.rnsecomapp.ui.ProductDetails

import com.rns.rnsecomapp.api.ApiObserver
import com.rns.rnsecomapp.api.WebServiceRequests
import com.rns.rnsecomapp.base.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import okhttp3.ResponseBody

class ProductDetailsPresenter(view: ProductDetailsFragment): BasePresenter<ProductDetailsView>(view) {
    override fun initObservable() {

    }

    override fun destroyObservables() {

    }

    override fun onViewReady() {

    }
    fun addToCart(qunat:String,productId:String,userId:String){
        WebServiceRequests.instance.addToCart(qunat,productId,userId).subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object :ApiObserver<AddCartData>("",getView()){
                override fun onResponse(t: AddCartData) {
                    getView().addToCart(t)
                }

            })
    }

    fun productDetails(productId: String)
    {
        WebServiceRequests.instance.getProductDetails(productId).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object :ApiObserver<ProductDetailsData>("",getView()){
                    override fun onResponse(t: ProductDetailsData) {
                        getView().productDetails(t)
                    }
                })
    }

    fun addToWishList(quantity:String,productId: String,userId: String)
    {
        WebServiceRequests.instance.addWishList(quantity,productId,userId).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object :ApiObserver<AddWishListResponseData>("",getView()){
                    override fun onResponse(t: AddWishListResponseData) {
                        getView().addWishList(t)
                    }

                })
    }
}