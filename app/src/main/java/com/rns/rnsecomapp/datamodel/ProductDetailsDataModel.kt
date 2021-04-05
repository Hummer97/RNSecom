package com.rns.rnsecomapp.datamodel
import com.google.gson.annotations.SerializedName


data class ProductDetailsDataModel(
    @SerializedName("image")
    val image: List<String?>?,
    @SerializedName("msg")
    val msg: String?,
    @SerializedName("no_of_review")
    val noOfReview: Int?,
    @SerializedName("product")
    val product: Product?,
    @SerializedName("rating")
    val rating: Any?,
    @SerializedName("similar_product")
    val similarProduct: List<SimilarProduct?>?,
    @SerializedName("status")
    val status: Int?
) {
    data class Product(
        @SerializedName("brand")
        val brand: String?,
        @SerializedName("categories")
        val categories: String?,
        @SerializedName("created_at")
        val createdAt: String?,
        @SerializedName("extra_discount")
        val extraDiscount: Any?,
        @SerializedName("featured_product")
        val featuredProduct: String?,
        @SerializedName("key_features")
        val keyFeatures: Any?,
        @SerializedName("long_description")
        val longDescription: Any?,
        @SerializedName("prescription")
        val prescription: String?,
        @SerializedName("price")
        val price: String?,
        @SerializedName("product_code")
        val productCode: String?,
        @SerializedName("product_model_no")
        val productModelNo: String?,
        @SerializedName("product_name")
        val productName: String?,
        @SerializedName("products_id")
        val productsId: String?,
        @SerializedName("quantity")
        val quantity: String?,
        @SerializedName("rating")
        val rating: Any?,
        @SerializedName("short_description")
        val shortDescription: Any?,
        @SerializedName("special_price")
        val specialPrice: Any?,
        @SerializedName("status")
        val status: String?,
        @SerializedName("sub_categories")
        val subCategories: Any?,
        @SerializedName("sub_sub_categories")
        val subSubCategories: String?,
        @SerializedName("sub_sub_sub_categories")
        val subSubSubCategories: Any?,
        @SerializedName("tags")
        val tags: Any?,
        @SerializedName("today_deals")
        val todayDeals: String?,
        @SerializedName("top_selling_product")
        val topSellingProduct: String?,
        @SerializedName("updated_at")
        val updatedAt: String?,
        @SerializedName("vendor_id")
        val vendorId: Any?
    )

    data class SimilarProduct(
        @SerializedName("brand")
        val brand: String?,
        @SerializedName("categories")
        val categories: String?,
        @SerializedName("created_at")
        val createdAt: String?,
        @SerializedName("extra_discount")
        val extraDiscount: Any?,
        @SerializedName("featured_product")
        val featuredProduct: String?,
        @SerializedName("key_features")
        val keyFeatures: Any?,
        @SerializedName("long_description")
        val longDescription: Any?,
        @SerializedName("prescription")
        val prescription: String?,
        @SerializedName("price")
        val price: String?,
        @SerializedName("product_code")
        val productCode: String?,
        @SerializedName("product_image")
        val productImage: String?,
        @SerializedName("product_model_no")
        val productModelNo: String?,
        @SerializedName("product_name")
        val productName: String?,
        @SerializedName("products_id")
        val productsId: String?,
        @SerializedName("quantity")
        val quantity: String?,
        @SerializedName("rate")
        val rate: Any?,
        @SerializedName("rating")
        val rating: Any?,
        @SerializedName("review")
        val review: Int?,
        @SerializedName("short_description")
        val shortDescription: Any?,
        @SerializedName("special_price")
        val specialPrice: Any?,
        @SerializedName("status")
        val status: String?,
        @SerializedName("sub_categories")
        val subCategories: Any?,
        @SerializedName("sub_sub_categories")
        val subSubCategories: String?,
        @SerializedName("sub_sub_sub_categories")
        val subSubSubCategories: Any?,
        @SerializedName("tags")
        val tags: Any?,
        @SerializedName("today_deals")
        val todayDeals: String?,
        @SerializedName("top_selling_product")
        val topSellingProduct: String?,
        @SerializedName("updated_at")
        val updatedAt: String?,
        @SerializedName("user_cart")
        val userCart: Int?,
        @SerializedName("user_wishlist")
        val userWishlist: Int?,
        @SerializedName("vendor_id")
        val vendorId: Any?
    )
}