package com.example.composemouredev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComponentAsRow()
        }
    }
}

@Composable
fun MyComponentAsRow() {
    Row(modifier = Modifier.padding(8.dp)) {
        MyImage()
        MyTexts(text = "Hello, Emi")
    }
}

@Composable
fun MyTexts(text: String) {
    Column(modifier = Modifier.padding(horizontal = 8.dp)) {
        Text(text)
        Text("Te amamos con el alma", Modifier.padding(vertical = 4.dp))
    }
}

@Composable
fun MyImage() {
    Image(
        painter = painterResource(R.drawable.ic_launcher_foreground),
        contentDescription = "Prueba imagen"
    )
}

@Preview
@Composable
fun PreviewTexts() {
    MyComponentAsRow()
}