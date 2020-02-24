package com.android.booksfeed.data.model.book

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class ImageLinks (
    val smallThumbnail : String,
    val thumbnail : String
) : Parcelable