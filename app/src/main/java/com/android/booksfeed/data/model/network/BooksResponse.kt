package com.android.booksfeed.data.model.network

import com.android.booksfeed.data.model.book.Item

class BooksResponse (
    val kind : String,
    val totalItems : Int,
    val items : List<Item>
) : NetworkResponseModel