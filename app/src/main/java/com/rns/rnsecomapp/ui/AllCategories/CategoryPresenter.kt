package com.rns.rnsecomapp.ui.AllCategories

import com.rns.rnsecomapp.api.ApiObserver
import com.rns.rnsecomapp.api.WebServiceRequests
import com.rns.rnsecomapp.base.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class CategoryPresenter(view:CategoriesFragment):BasePresenter<CategoryView>(view) {
    override fun initObservable() {

    }

    override fun destroyObservables() {
    }

    override fun onViewReady() {
    }
    fun getCategoray(){
        WebServiceRequests.instance.categoary()
            ?.subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())
            ?.subscribe ( object : ApiObserver<CategoriesModel>("",getView()){
                override fun onResponse(t: CategoriesModel) {
                  getView().getResponse(t)
                }

            })
    }
}