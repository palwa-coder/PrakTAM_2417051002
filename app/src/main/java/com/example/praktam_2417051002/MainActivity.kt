package com.example.praktam_2417051002

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.praktam_2417051002.ui.theme.PrakTAM_2417051002Theme
import model.Game
import model.game_source

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrakTAM_2417051002Theme {
                ChatGameScreen()
            }
        }
    }
}

@Composable
fun ChatGameScreen() {

    val game = game_source.dummygame[0]

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Column {

            Image(
                painter = painterResource(id = R.drawable.room),
                contentDescription = "room",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                verticalAlignment = Alignment.Top
            ) {

                Image(
                    painter = painterResource(id = game.imageRes),
                    contentDescription = game.name,
                    modifier = Modifier.size(70.dp)
                )

                Spacer(modifier = Modifier.width(12.dp))

                Column(
                    modifier = Modifier
                        .clip(RoundedCornerShape(12.dp))
                        .background(Color.White)
                        .padding(12.dp)
                ) {

                    Text(
                        text = game.name,
                        fontWeight = FontWeight.Bold
                    )

                    Text(text = game.chat)
                }
            }
        }

        Column {

            Button(
                onClick = { },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = game.choice)
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = { },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Another choice")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ChatGamePreview() {
    PrakTAM_2417051002Theme {
        ChatGameScreen()
    }
}