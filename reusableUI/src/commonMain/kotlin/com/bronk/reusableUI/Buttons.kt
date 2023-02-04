package com.bronk.common
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*

@Composable
fun Button() {
    var text by remember { mutableStateOf("Hello, World!") }
    MaterialTheme {
        Button(onClick = {
            text = "Hello"
        }) {
            Text(text)
        }
    }
}
