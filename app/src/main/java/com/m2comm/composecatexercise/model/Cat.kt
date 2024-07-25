package com.m2comm.composecatexercise.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Cat(
    val description: String = "",
    val id: String = "",
    val lifeSpan: String = "",
    val name: String = "",
    val origin: String = "",
    val imageUrl: String = ""
) : Parcelable
