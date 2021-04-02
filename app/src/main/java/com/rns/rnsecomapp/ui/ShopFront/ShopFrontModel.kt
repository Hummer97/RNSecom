package com.rns.rnsecomapp.ui.ShopFront
import com.google.gson.annotations.SerializedName


data class ShopFrontModel(
    @SerializedName("msg")
    val msg: String?,
    @SerializedName("product-list")
    val productList: List<ProductList>?,
    @SerializedName("status")
    val status: Int?
)

data class ProductList(
    @SerializedName("brand")
    val brand: Any?,
    @SerializedName("categories")
    val categories: String?,
    @SerializedName("created_at")
    val createdAt: String?,
    @SerializedName("extra_discount")
    val extraDiscount: Any?,
    @SerializedName("featured_product")
    val featuredProduct: Any?,
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
    val productModelNo: Any?,
    @SerializedName("product_name")
    val productName: String?,
    @SerializedName("products_id")
    val productsId: String?,
    @SerializedName("quantity")
    val quantity: Any?,
    @SerializedName("rating")
    val rating: Any?,
    @SerializedName("short_description")
    val shortDescription: Any?,
    @SerializedName("special_price")
    val specialPrice: String?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("sub_categories")
    val subCategories: Any?,
    @SerializedName("sub_sub_categories")
    val subSubCategories: Any?,
    @SerializedName("sub_sub_sub_categories")
    val subSubSubCategories: Any?,
    @SerializedName("tags")
    val tags: Any?,
    @SerializedName("today_deals")
    val todayDeals: String?,
    @SerializedName("top_selling_product")
    val topSellingProduct: Any?,
    @SerializedName("updated_at")
    val updatedAt: String?,
    @SerializedName("vendor_id")
    val vendorId: Any?
)