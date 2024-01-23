package com.islamzada.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Infos(
    val active_warning: String?,
    val baggage_info: BaggageInfo?,
    val duration: Duration?,
    val is_business: Boolean?,
    val is_mask_required: Boolean?,
    val is_promo: Boolean?,
    val is_reservable: Boolean?,
    val is_virtual_interlining: Boolean?
) : Parcelable