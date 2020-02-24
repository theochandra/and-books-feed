package com.android.booksfeed.data.model.book

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class ReadingModes (
    val text : Boolean,
    val image : Boolean
) : Parcelable