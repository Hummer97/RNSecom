package com.rns.rnsecomapp.ui.ProductDetails

import android.os.Bundle
import android.util.Log
import androidx.navigation.NavArgs
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import com.rns.rnsecomapp.R
import com.rns.rnsecomapp.SharedPrefManager.SharedPrefManager
import com.rns.rnsecomapp.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_product_details.*
import okhttp3.ResponseBody


class ProductDetailsFragment : BaseFragment<ProductDetailsView, ProductDetailsPresenter>(),ProductDetailsView {
    private lateinit var mID: String
    private lateinit var mUserId: String
    private lateinit var sharedPrefManager: SharedPrefManager
    private var count: Int = 0
    private lateinit var list:List<ProductDetailsData>
    override fun getContentView(): Int {
        return R.layout.fragment_product_details
    }

    override fun getPresenterClass(): Class<ProductDetailsPresenter> {
        return ProductDetailsPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
        sharedPrefManager = SharedPrefManager.getInstance(requireContext())
        mUserId = sharedPrefManager.user.id.toString()
        if (arguments != null) {
            mID = ProductDetailsFragmentArgs.fromBundle(requireArguments()).id
        }
        Log.d("Details",mID)
        presenter?.productDetails(mID)
//        product_details_add_cart_btn.setOnClickListener {
//            Navigation.findNavController(product_details_description).navigate(R.id.action_productDetailsFragment_to_myBagFragment)
//        }
        product_details_wish_list_btn.setOnClickListener {
            presenter?.addToWishList("1",mID,mUserId)
        }


        product_details_quantity_count_incress_btn.setOnClickListener {
            var countdata = product_details_quantity_count_txt.text
            count = countdata.toString().toInt()
            count++
            product_details_quantity_count_txt.text = count.toString()
        }
        product_details_quantity_count_dicress_btn.setOnClickListener {
            var countdata = product_details_quantity_count_txt.text
            count = countdata.toString().toInt()
            if(count > 1)
            {
                count--
                product_details_quantity_count_txt.text = count.toString()
            }
            else
            {
                Snackbar.make(
                    product_details_quantity_count_txt,
                    "Item Should not be negative",
                    Snackbar.LENGTH_LONG
                ).show()
            }
        }
        product_details_add_cart_btn.setOnClickListener {

//          presenter!!.addToCart(count.toString(),mID,mUserId)
            Navigation.findNavController(product_details_description).navigate(R.id.action_productDetailsFragment_to_myBagFragment)

        }

    }

    override fun addToCart(responseBody: AddCartData) {

        if (responseBody.status == 200)
        {
            Snackbar.make(product_details_price,responseBody?.msg.toString(),Snackbar.LENGTH_LONG).show()

        }

    }

    override fun productDetails(responseBody: ProductDetailsData) {
        if (responseBody.status==200)
        {
            product_details_title.text = responseBody.product!!.productName
            product_details_short_discription.text = responseBody?.product?.shortDescription.toString()
            product_details_price.text ="Rs "+ responseBody.product.price

            if(responseBody.rating.toString().equals("null"))
            {
                product_details_rating.rating = 0F
            }
            else
            {
                product_details_rating.rating = responseBody.rating.toString().toFloat()
            }
            product_details_description.text = responseBody.product.longDescription.toString()
            product_details_image.adapter = ProductDetailsImageAdapter(requireContext(),responseBody)
        }
    }

    override fun addWishList(response: AddWishListResponseData) {
        if (response.status == 200)
        {
            Snackbar.make(product_details_wish_list_btn,response.msg.toString(),Snackbar.LENGTH_LONG).show()
        }
        else
        {
            Snackbar.make(product_details_wish_list_btn,response.msg.toString(),Snackbar.LENGTH_LONG).show()
        }
    }

}