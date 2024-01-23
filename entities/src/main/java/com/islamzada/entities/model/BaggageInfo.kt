package com.islamzada.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class BaggageInfo(
    val carryOn: CarryOn?,
    val firstBaggageCollection: List<FirstBaggageCollection?>?
) : Parcelable