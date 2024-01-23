package com.islamzada.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Airline(
    val code: String?,
    val image: String?,
    val name: String?,
    val slug: String?
) : Parcelable