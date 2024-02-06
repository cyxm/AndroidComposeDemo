package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PreviewMessageCard()
        }
    }
}

@Composable
fun MessageCard(msg: Message) {
    Row {
        Column {
            PaddingValues(Dp(24F))
            Button(onClick = { /*TODO*/ }) {
                Text(text = "123123")
            }
        }
        Column {
            Text(text = msg.body)
        }
    }
}

data class Message(val author: String, val body: String)

@Preview(showBackground = true)
@Composable
fun PreviewMessageCard() {
    MyApplicationTheme {
        MessageCard(
            msg = Message("Lexi", "Hey, take a look at Jetpack Compose, it's great!")
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMessageCard2() {
    MyApplicationTheme {
        MessageCard(
            msg = Message("Lexi", "Hey, take a look at Jetpack Compose, it's great!")
        )
    }
}