package com.islamzada.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Destination(
    val airport_name: String?,
    val city_name: String?,
    val country_code: String?,
    val country_name: String?,
    val id: String?,
    val is_city: Boolean?,
    val label: String?,
    val slug: String?
) : Parcelable