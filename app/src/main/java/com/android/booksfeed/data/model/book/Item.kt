package com.android.booksfeed.data.model.book

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Item (
    val kind : String,
    val id : String,
    val etag : String,
    val selfLink : String,
    val volumeInfo: VolumeInfo
) : Parcelable