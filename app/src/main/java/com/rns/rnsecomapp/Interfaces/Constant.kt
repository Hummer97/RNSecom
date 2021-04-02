package com.rns.rnsecomapp.Interfaces

interface Constant {
    companion object
    {
        const val BASE_URL = "https://rnsinfotecherp.com/rnsecom/public/"
        const val CATEGORIES = BASE_URL+"api/categories"
        const val PRODUCTS = BASE_URL+"api/product-list"
    }
}