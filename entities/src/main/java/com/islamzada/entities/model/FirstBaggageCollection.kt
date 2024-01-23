package com.islamzada.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class FirstBaggageCollection(
    val allowance: Int?,
    val part: Int?,
    val paxType: String?,
    val small: Boolean?,
    val type: String?,
    val unit: String?
) : Parcelable