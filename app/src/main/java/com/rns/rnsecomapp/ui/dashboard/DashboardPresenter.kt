package com.rns.rnsecomapp.ui.dashboard

import com.rns.rnsecomapp.api.ApiObserver
import com.rns.rnsecomapp.api.WebServiceRequests
import com.rns.rnsecomapp.base.BasePresenter
import com.rns.rnsecomapp.ui.AllCategories.CategoriesModel
import com.rns.rnsecomapp.ui.ShopFront.ShopFrontModel
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class DashboardPresenter(view: DashboardFragment):BasePresenter<DashboardView>(view) {
    override fun initObservable() {

    }

    override fun destroyObservables() {

    }

    override fun onViewReady() {

    }

    fun getCategory()
    {
        WebServiceRequests.instance.categoary().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : ApiObserver<CategoriesModel>("",getView()){
                    override fun onResponse(t: CategoriesModel) {
                        getView().getCategoriesResponse(t);
                    }

                })

    }
    fun getBanner()
    {
        WebServiceRequests.instance.banner().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object  : ApiObserver<BannerDataClass>("",getView()){
                    override fun onResponse(t: BannerDataClass) {
                        getView().getBannerResponse(t)
                    }

                })
    }
    fun getArrival()
    {
        WebServiceRequests.instance.arrival().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object  : ApiObserver<ShopFrontModel>("",getView()){
                    override fun onResponse(t: ShopFrontModel) {
                        getView().getArrivalResponse(t)
                    }

                })
    }
}