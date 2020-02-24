package com.android.booksfeed.data.model.book

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class PanelizationSummary (
    val containsEpubBubbles : Boolean,
    val containsImageBubbles : Boolean
) : Parcelable