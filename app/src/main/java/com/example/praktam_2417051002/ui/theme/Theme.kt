package com.example.praktam_2417051002.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val AppColorScheme = lightColorScheme(
    primary = Color(0xFFE65100),
    secondary = Color(0xFFFFA726),
    background = Color(0xFFFFF8F1),
    surface = Color(0xFFFFFFFF),
    onPrimary = Color(0xFFFFFFFF)
)

@Composable
fun PrakTAM_2417051002Theme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = AppColorScheme,
        typography = AppTypography,
        content = content
    )
}