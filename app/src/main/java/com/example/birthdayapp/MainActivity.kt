package com.example.birthdayapp
import androidx.compose.foundation.Image

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdayapp.ui.theme.BirthdayAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(message = "Happy Birthday Mikhail", from = "From Mikhail")
                }
            }
        }
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.dark)
    Image(
        painter = image,
        contentDescription = null,
        Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun GreetingText(
    message: String,
    modifier: Modifier = Modifier,
    from: String = "Your Best Friend",
) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(20.dp)
    ) {
        Text(
            text = message,
            fontSize = 80.sp,
            lineHeight = 96.sp,
            textAlign = TextAlign.Right
        )
        Text(
            text = from,
            fontSize = 30.sp,
            lineHeight = 40.sp,
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun BirthdayAppPreview() {
    BirthdayAppTheme {
        GreetingImage(message = "В субботу пять пар мои чуваки...", "От Михаила")
    }
}