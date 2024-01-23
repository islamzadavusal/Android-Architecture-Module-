package com.islamzada.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SegmentAttributes(
    val airplane_brand: String?,
    val entertainment: String?,
    val free_meal: Boolean?,
    val seat_pitch: String?,
    val seat_plan: String?,
    val wifi: Int?
) : Parcelable