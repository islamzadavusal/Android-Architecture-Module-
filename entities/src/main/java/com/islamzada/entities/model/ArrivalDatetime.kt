package com.islamzada.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ArrivalDatetime(
    val date: String?,
    val time: String?,
    val timestamp: Int?
) : Parcelable