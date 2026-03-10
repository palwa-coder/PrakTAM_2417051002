package model

import com.example.praktam_2417051002.R

object game_source {

    val dummygame = listOf(

        Game(
            name = "Boy",
            chat = "Where am I?",
            choice = "(Wake Up)",
            imageRes = R.drawable.boy_image
        ),

        Game(
            name = "Mysterious Girl",
            chat = "Oh! You finally woke up.",
            choice = "Where am I?",
            imageRes = R.drawable.girl_image
        ),

        Game(
            name = "Mysterious Girl",
            chat = "You were unconscious in the street, so I brought you to my room.",
            choice = "How did I get here?",
            imageRes = R.drawable.girl_image
        ),

        Game(
            name = "Boy",
            chat = "Hey! Are you okay?",
            choice = "Yes, I think so.",
            imageRes = R.drawable.boy_image
        ),

        Game(
            name = "Boy",
            chat = "Good. This place is dangerous.",
            choice = "What should we do?",
            imageRes = R.drawable.boy_image
        )
    )
}