package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.input.key.Key.Companion.H
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.Purple80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PreviewPageCommonOptions()
        }
    }
}

@Preview(widthDp = 360, heightDp = 640, showBackground = true, showSystemUi = false)
@Preview(widthDp = 480, heightDp = 320, showBackground = true)
@Preview(widthDp = 320, heightDp = 530, showBackground = true)
@Composable
fun PreviewPageCommonOptions() {
    val options = remember {
        mutableListOf(
            "1",
            "2"
        )
    }

    MyApplicationTheme {
        PageCommonOptions(options)
    }
}

@Composable
fun PageCommonOptions(options: MutableList<String>) {
    Column {
        PartTitleCommon(
            Modifier.height(56.dp),
            title = "test1111111111111312312312312311111111111111113333333333331111111111"
        )
        PartBodyOptions(Modifier.fillMaxHeight())
    }
}

@Composable
fun PartTitleCommon(
    modifier: Modifier = Modifier,
    needShow: Boolean = true,
    title: String
) {
    Row(
        modifier = modifier.background(Purple80),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.baseline_arrow_back_24),
            contentDescription = null,
            modifier = Modifier
                .size(56.dp)
                .padding(8.dp),
            contentScale = ContentScale.Fit,
            colorFilter = ColorFilter.tint(Color.White)
        )
        Text(
            modifier = Modifier.weight(1F),
            text = title,
            color = Color.White,
            fontSize = 20.sp,
            overflow = TextOverflow.Ellipsis
        )
        Column(
            modifier = Modifier.size(56.dp),
            horizontalAlignment = Alignment.End
        ) {}
    }
}

@Composable
fun PartBodyOptions(modifier: Modifier = Modifier) {
    Column(modifier) {

    }
}