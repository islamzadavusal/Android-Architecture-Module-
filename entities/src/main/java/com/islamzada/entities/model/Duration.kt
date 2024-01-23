package com.islamzada.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Duration(
    val day: Int?,
    val hour: Int?,
    val minute: Int?,
    val total_minutes: Int?
) : Parcelable