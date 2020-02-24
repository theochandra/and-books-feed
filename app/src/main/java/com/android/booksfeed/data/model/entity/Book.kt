package com.android.booksfeed.data.model.entity

import android.os.Parcelable
import androidx.room.Entity
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(primaryKeys = [("id")])
data class Book (
    var id : String,
    var title : String,
    var author : String,
    var thumbnailUrl : String,
    var rating : Int
) : Parcelable