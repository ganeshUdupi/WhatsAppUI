package com.ganesh.whatsappui.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun TextComponent(
    value: String,
    fontSize: TextUnit,
    color: Color,
    modifier: Modifier?,
    fontWeight: FontWeight? = FontWeight.Normal,
) {
    if (modifier != null) {
        Text(
            modifier = modifier, text = value, style = TextStyle(
                fontSize = 18.sp, color = color, fontWeight = fontWeight
            )
        )
    } else Text(
        text = value, style = TextStyle(
            fontSize = 18.sp, color = color, fontWeight = fontWeight

        )
    )
}