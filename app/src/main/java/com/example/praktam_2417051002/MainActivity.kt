package com.example.praktam_2417051002

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.praktam_2417051002.ui.theme.PrakTAM_2417051002Theme
import model.game_source


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrakTAM_2417051002Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(modifier = Modifier.padding(innerPadding))
                }
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    val Game = game_source.dummygame[0]

    Column(modifier = Modifier.fillMaxSize().padding(all = 30.dp)) {
        Text(text = "Nama: ${Game.nama}")
        Text(text = "Chat: ${Game.chat}")
        Text(text = "Choices: ${Game.choices}")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrakTAM_2417051002Theme {
        Greeting()
    }
}