package com.android.booksfeed.data.model.book

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class IndustryIdentifier (
    val type : String,
    val identifier : String
) : Parcelable