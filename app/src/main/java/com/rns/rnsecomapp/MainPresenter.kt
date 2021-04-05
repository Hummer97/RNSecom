package com.rns.rnsecomapp

import com.rns.rnsecomapp.api.ApiObserver
import com.rns.rnsecomapp.api.WebServiceRequests
import com.rns.rnsecomapp.base.BasePresenter
import com.rns.rnsecomapp.ui.MyBag.MyCartDataClass
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainPresenter(view: MainActivity):BasePresenter<MainView>(view) {
    override fun initObservable() {

    }

    override fun destroyObservables() {

    }

    override fun onViewReady() {

    }
    fun getMyCartDetails(user_id:String)
    {
        WebServiceRequests.instance.getMyCartDetails(user_id).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : ApiObserver<MyCartDataClass>("",getView()){
                    override fun onResponse(t: MyCartDataClass) {
                        getView().getMyCartResponse(t)
                    }

                })
    }
}