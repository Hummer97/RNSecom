package com.rns.rnsecomapp.ui.Setting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment

class SettingFragment : BaseFragment<SettingView,SettingPresenter>(),SettingView {
    override fun getContentView(): Int {
       return R.layout.fragment_setting
    }

    override fun getPresenterClass(): Class<SettingPresenter> {
        return SettingPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {

    }

}