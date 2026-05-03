package model

import com.example.praktam_2417051002.R

object game_source {

    val dummygame = listOf(

        Game(
            name = "Boy",
            chat = "Where am I?",
            choice = "(Wake Up)",
            imageRes = R.drawable.boy_image,
            backgroundUrl = "https://img.itch.zone/aW1nLzQ1MzE4MzIucG5n/original/tzKyzs.png"
        ),

        Game(
            name = "Mysterious Girl",
            chat = "Oh! You finally woke up.",
            choice = "Where am I?",
            imageRes = R.drawable.girl_image,
            backgroundUrl = "https://img.itch.zone/aW1nLzQ1MzE4MzIucG5n/original/tzKyzs.png"
        ),

        Game(
            name = "Mysterious Girl",
            chat = "You were unconscious in the street...",
            choice = "How did I get here?",
            imageRes = R.drawable.girl_image,
            backgroundUrl = "https://img.itch.zone/aW1nLzQ1MzE4MzIucG5n/original/tzKyzs.png"
        ),

        Game(
            name = "Boy",
            chat = "Hey! Are you okay?",
            choice = "Yes, I think so.",
            imageRes = R.drawable.boy_image,
            backgroundUrl = "https://img.itch.zone/aW1nLzQ1MzE4MzIucG5n/original/tzKyzs.png"
        ),

        Game(
            name = "Boy",
            chat = "Good. This place is dangerous.",
            choice = "What should we do?",
            imageRes = R.drawable.boy_image,
            backgroundUrl = "https://img.itch.zone/aW1nLzQ1MzE4MzIucG5n/original/tzKyzs.png"
        )
    )
}