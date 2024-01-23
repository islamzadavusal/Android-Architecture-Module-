package com.islamzada.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Airport(
    val airport_name: String,
    val city_code: String,
    val city_name: String,
    val city_slug: String,
    val country_code: String,
    val country_name: String,
    val id: String,
    val slug: String
) : Parcelable