package com.rns.rnsecomapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseFragment<HomeView,HomePresenter>(),HomeView {


    override fun getContentView(): Int {
        return R.layout.fragment_home
    }

    override fun getPresenterClass(): Class<HomePresenter> {
        return HomePresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {

    }

//    override fun setDtat(result: MatchResult) {
//        text_home.text = result.toString()
//    }
}