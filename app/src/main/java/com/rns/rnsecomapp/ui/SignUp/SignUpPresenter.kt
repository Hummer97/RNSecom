package com.rns.rnsecomapp.ui.SignUp

import com.rns.rnsecomapp.api.ApiObserver
import com.rns.rnsecomapp.api.WebServiceRequests
import com.rns.rnsecomapp.base.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class SignUpPresenter(view: SignUpActivity):BasePresenter<SignUpView>(view) {
    override fun initObservable() {
    }

    override fun destroyObservables() {
    }

    override fun onViewReady() {
    }

    fun userRegistrationApiHit(user_name: String,email_id: String,password: String,mobile_no: String)
    {
        WebServiceRequests.instance.registration(user_name, email_id, password, mobile_no).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : ApiObserver<RegisteredUserData>("",getView()){
                    override fun onResponse(t: RegisteredUserData) {
                            getView().getUserRegistration(t)
                    }

                })
    }

}