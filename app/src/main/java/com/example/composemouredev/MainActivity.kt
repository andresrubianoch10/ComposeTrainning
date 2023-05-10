package com.example.composemouredev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
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
        aristiDev()
    }

    private fun mourseDev() {
        setContent {
            ComposeMoureDevTheme {
                MyComponentAsRow()
            }
        }
    }

    private fun aristiDev() {
        setContent {
            ComposeMoureDevTheme {
                
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