package com.islamzada.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class FilterBoundaries(
    val departureMaxDuration: Int?,
    val departurePrice: DeparturePrice?,
    val returnMaxDuration: Int?,
    val returnPrice: ReturnPrice?
) : Parcelable