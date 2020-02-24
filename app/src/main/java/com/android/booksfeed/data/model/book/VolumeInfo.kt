package com.android.booksfeed.data.model.book

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class VolumeInfo (
    val title : String,
    val authors : List<String>,
    val publisher : String,
    val publishedDate : String,
    val description : String,
    val industryIdentifiers : List<IndustryIdentifier>,
    val readingModes : ReadingModes,
    val pageCount : Int,
    val printType : String,
    val categories : List<String>,
    val averageRating : Float,
    val ratingsCount : Int,
    val maturityRating : String,
    val allowAnonLogging : Boolean,
    val contentVersion : String,
    val panelizationSummary : PanelizationSummary,
    val imageLinks : ImageLinks,
    val language : String,
    val previewLink : String,
    val infoLink : String,
    val canonicalVolumeLink : String
) : Parcelable