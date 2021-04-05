package com.rns.rnsecomapp.ui.Products

import com.rns.rnsecomapp.api.ApiObserver
import com.rns.rnsecomapp.api.WebServiceRequests
import com.rns.rnsecomapp.base.BasePresenter
import com.rns.rnsecomapp.datamodel.CategoryWiseProductModel
import com.rns.rnsecomapp.ui.SignUp.RegisteredUserData
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ProductsPresenter(view: ProductsFragment) : BasePresenter<ProductsView>(view) {
    override fun initObservable() {

    }

    override fun destroyObservables() {

    }

    override fun onViewReady() {

    }
    fun getCategoryWiseProductList(cat_id:String)
    {
//        WebServiceRequests.instance.registration(user_name, email_id, password, mobile_no).subscribeOn(
////            Schedulers.io())
////            .observeOn(AndroidSchedulers.mainThread())
////            .subscribe(object : ApiObserver<RegisteredUserData>("",getView()){
////                override fun onResponse(t: RegisteredUserData) {
////                    getView().getUserRegistration(t)
////                }
////
////            })
        WebServiceRequests.instance.getCategoryWiseProduct(cat_id).subscribeOn(
            Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object :ApiObserver<CategoryWiseProductModel>("",getView()){
                override fun onResponse(t: CategoryWiseProductModel) {
                    getView().getProducrListData(t)
                }

            })
    }
}