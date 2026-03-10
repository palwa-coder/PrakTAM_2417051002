package model

import androidx.annotation.DrawableRes

data class Game(
    val name: String,
    val chat: String,
    val choice: String,
    @DrawableRes val imageRes: Int
)