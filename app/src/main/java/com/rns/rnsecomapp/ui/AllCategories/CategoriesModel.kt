package com.rns.rnsecomapp.ui.AllCategories
import com.google.gson.annotations.SerializedName


data class CategoriesModel(
    @SerializedName("category")
    val category: List<Category>?,
    @SerializedName("msg")
    val msg: String?,
    @SerializedName("status")
    val status: Int?
)

data class Category(
    @SerializedName("back_color")
    val backColor: String?,
    @SerializedName("categories_id")
    val categoriesId: String?,
    @SerializedName("category_name")
    val categoryName: String?,
    @SerializedName("created_at")
    val createdAt: String?,
    @SerializedName("image")
    val image: String?,
    @SerializedName("parent_id")
    val parentId: Any?,
    @SerializedName("percentage_off")
    val percentageOff: Any?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("sub_category_name")
    val subCategoryName: Any?,
    @SerializedName("sub_parent_id")
    val subParentId: Any?,
    @SerializedName("sub_sub_parent_id")
    val subSubParentId: Any?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("updated_at")
    val updatedAt: String?,
    @SerializedName("view_home")
    val viewHome: String?
)