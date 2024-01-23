package com.islamzada.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ReturnPrice(
    val max: Int?,
    val min: Int?
) : Parcelable