package com.rns.rnsecomapp.ui.SignIn

import com.rns.rnsecomapp.api.ApiObserver
import com.rns.rnsecomapp.api.WebServiceRequests
import com.rns.rnsecomapp.base.BasePresenter
import com.rns.rnsecomapp.datamodel.UserData
import com.rns.rnsecomapp.datamodel.UserDataClass
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class SignInPresenter(view:SignInActivity):BasePresenter<SignInView>(view) {
    override fun initObservable() {

    }

    override fun destroyObservables() {

    }

    override fun onViewReady() {

    }

    fun hitApi(user_name:String,password:String){
        WebServiceRequests.instance.login(user_name,password).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : ApiObserver<UserDataClass>("",getView()){
                    override fun onResponse(t: UserDataClass) {
                        getView().getLoginResponse(t)
                    }
                })
    }

}