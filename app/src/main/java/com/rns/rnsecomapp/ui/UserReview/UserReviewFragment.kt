package com.rns.rnsecomapp.ui.UserReview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.base.BaseFragment

class UserReviewFragment : BaseFragment<UserReviewView,UserReviewPresenter>(),UserReviewView {
    override fun getContentView(): Int {
        return R.layout.fragment_user_review
    }

    override fun getPresenterClass(): Class<UserReviewPresenter> {
        return UserReviewPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
        TODO("Not yet implemented")
    }

}