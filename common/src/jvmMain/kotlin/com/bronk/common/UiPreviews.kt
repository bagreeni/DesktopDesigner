package com.bronk.common

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Modifier

class UiPreviews {
}

@Preview
@Composable
fun GridPreview(){
    MaterialTheme {
        GridSelector(
            nRows = 1, 4,
            items = mutableStateListOf("Beans","Snack", "Apple","Computer","Cherry","Hello",),
            modifier = Modifier
        )
    }
}