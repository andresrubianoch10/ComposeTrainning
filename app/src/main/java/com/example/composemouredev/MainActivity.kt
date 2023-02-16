package com.example.composemouredev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTexts("Hello, Emi!")
        }
    }

    @Composable
    fun MyTexts(text: String) {
        Text(text)
        Text("Te amamos con el alma")
    }

    @Preview
    @Composable
    fun PreviewTexts() {
        MyTexts(text = "Hello, Emi.")
    }
}