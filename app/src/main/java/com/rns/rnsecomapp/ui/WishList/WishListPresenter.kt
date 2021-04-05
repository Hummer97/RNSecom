package com.rns.rnsecomapp.ui.WishList

import com.rns.rnsecomapp.api.ApiObserver
import com.rns.rnsecomapp.api.WebServiceRequests
import com.rns.rnsecomapp.base.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class WishListPresenter(view: WishListFragment):BasePresenter<WishListView>(view) {
    override fun initObservable() {

    }

    override fun destroyObservables() {

    }

    override fun onViewReady() {

    }

    fun getWishListResponse(id:String)
    {
        WebServiceRequests.instance.getWishList(id).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object :ApiObserver<WishListData>("",getView()){
                    override fun onResponse(t: WishListData) {
                        getView().getWishListResponse(t)
                    }

                })
    }
}