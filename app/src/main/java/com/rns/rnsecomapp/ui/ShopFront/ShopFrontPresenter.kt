package com.rns.rnsecomapp.ui.ShopFront

import com.rns.rnsecomapp.api.ApiObserver
import com.rns.rnsecomapp.api.WebServiceRequests
import com.rns.rnsecomapp.base.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ShopFrontPresenter(view: ShopFrontFragment) : BasePresenter<ShopFrontView>(view) {
    override fun initObservable() {

    }

    override fun destroyObservables() {

    }

    override fun onViewReady() {

    }

    fun getProduct()
    {
        WebServiceRequests.instance.arrival().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object  : ApiObserver<ShopFrontModel>("",getView()){
                    override fun onResponse(t: ShopFrontModel) {
                        getView().getProduct(t)
                    }
                })
    }
}