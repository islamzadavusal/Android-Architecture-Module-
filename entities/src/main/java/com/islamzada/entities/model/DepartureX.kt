package com.islamzada.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DepartureX(
    val next_day_price: Int?,
    val previous_day_price: Int?
) : Parcelable