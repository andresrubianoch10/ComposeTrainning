package com.example.composemouredev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composemouredev.ui.theme.ComposeMoureDevTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mourseDev()
    }

    private fun mourseDev() {
        setContent {
            ComposeMoureDevTheme {
                MyComponentAsRow()
            }
        }
    }
}

@Composable
fun MyComponentAsRow() {
    Row(modifier = Modifier.padding(8.dp)) {
        Components()
    }
}

@Composable
fun Components() {
    MyImage()
    MyTexts(text = "Hello, Emi")
}

@Composable
fun MyComponentAsColumn() {
    Column(modifier = Modifier.padding(8.dp)) {
        Components()
    }
}

@Composable
fun MyComponentAsBox() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .background(Color.Cyan)
                .verticalScroll(
                    rememberScrollState()
                )
        ) {
            Components()
        }
    }
}

@Composable
fun MyComponentAsColumnByAristi() {
    Column(Modifier.fillMaxSize()) {
        Text("Ejemplo 1", modifier = Modifier.background(Color.Red))
        Text("Ejemplo 2", modifier = Modifier.background(Color.Blue))
        Text("Ejemplo 3", modifier = Modifier.background(Color.Green))
        Text("Ejemplo 4", modifier = Modifier.background(Color.Cyan))
    }
}

@Composable
fun MyTexts(text: String) {
    Column(modifier = Modifier.padding(horizontal = 8.dp)) {
        Text(text)
        Spacer(Modifier.height(16.dp))
        Text("Te amamos con el alma")
    }
}

@Composable
fun MyImage() {
    Image(
        painter = painterResource(R.drawable.ic_launcher_foreground),
        contentDescription = "Prueba imagen",
        modifier = Modifier
            .size(64.dp)
            .clip(CircleShape)
            .background(Color.Gray)
    )
}

@Preview
@Composable
fun PreviewsRow() {
    MyComponentAsRow()
}

@Preview
@Composable
fun PreviewsColumn() {
    MyComponentAsColumn()
}

@Preview(showBackground = true)
@Composable
fun PreviewsBox() {
    MyComponentAsBox()
}

@Preview(showBackground = true)
@Composable
fun PreviewColumnByAristi() {
    MyComponentAsColumnByAristi()
}
