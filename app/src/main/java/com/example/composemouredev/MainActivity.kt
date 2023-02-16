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
            MyText("Hello, Emi!")
        }
    }

    @Composable
    fun MyText(text: String) {
        Text(text)
    }

    @Preview
    @Composable
    fun PreviewTexts() {
        MyText(text = "Hello, Emi.")
    }
}