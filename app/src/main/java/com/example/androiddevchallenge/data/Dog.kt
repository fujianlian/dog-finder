package com.example.androiddevchallenge.data

import androidx.annotation.DrawableRes
import java.io.Serializable

data class Dog(
    val name: String,
    val age: String,
    val gender: String,
    val breed: String,
    val location: String,
    @DrawableRes val img: Int,
): Serializable