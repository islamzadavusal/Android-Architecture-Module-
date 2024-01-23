package com.islamzada.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CarryOn(
    val allowance: Int?,
    val is_small: Boolean?,
    val part: Int?,
    val type: String?,
    val unit: String?
) : Parcelable