package com.bronk.common

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Text
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import org.jetbrains.skia.Drawable

@Composable
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {
        Row(modifier = Modifier.fillMaxSize()) {
            //Import/Icons box
            IconsLayout()

            //Programs Box
            ProgramsLayout()
        }
        Row() {
            //Go button
        }

    }
}


@Composable
fun IconsLayout() {
    Column() {
        Text(text = "Icon")

    }
}

@Composable
fun ProgramsLayout() {
    Column() {
        Text(text = "Apply to Programs")

    }
}

@Composable
fun GridSelector(nRows: Int?, mColumns: Int = 1, modifier: Modifier?, items: List<String>) {
    LazyVerticalGrid(
        contentPadding = PaddingValues(4.dp),
        columns = GridCells.Fixed(mColumns),
        modifier = Modifier.fillMaxSize().border(width = 2.dp, color = MaterialTheme.colors.error),
        verticalArrangement = Arrangement.Top,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        items(items) { gridItem ->
            //TODO: Update content descriptions to match filename
            Box(contentAlignment = Alignment.Center, modifier = Modifier.background(color = MaterialTheme.colors.error).wrapContentSize()) {
                Text(gridItem)
            }
        }
    }
}

@Composable
fun GridItem(text : String){
    Column {
        //Image of icon
        Box(modifier = Modifier.defaultMinSize(64.dp)) {

        }
        // filename
        Text(text)
    }
}