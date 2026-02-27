package model
import androidx.annotation.DrawableRes

data class Game(
    val nama: String,
    val chat: String,
    val choices: String,
    @DrawableRes val ImageRes: Int
)