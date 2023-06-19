package com.example.businnescardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businnescardapp.ui.theme.BusinnesCardAppTheme
import com.example.quadrants.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinnesCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF3ddc84)
                    //  modifier= Modifier.background(0xFF3ddc84)

                ) {
                    displayer()
                }
            }
        }
    }
}

@Composable
fun displayer(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                modifier = Modifier.size(155.dp),
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null,
            )
            Text(
                text = "Jennifer Doe",
                modifier = Modifier.padding(24.dp),
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontSize = 25.sp

            )
            Text(
                text = " Android Developer ExtraOrdinaire",
                textAlign = TextAlign.Center,
                fontSize = 18.sp
            )

        }
        Column(modifier = Modifier
            .align(Alignment.BottomCenter)
            .padding(bottom = 26.dp)) {
            Replicate(content = "+254797964834")
            Replicate(icon = Icons.Default.Share, content = "@AndroidDev")
            Replicate(icon = Icons.Default.Email, content = "sila.android20@gmail.com")
        }


    }
}

//@Preview(showBackground = true)
@Composable
fun Replicate(icon: ImageVector = Icons.Default.Phone, content: String = "Random content") {

    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)) {
        Icon(imageVector = icon, contentDescription = null, tint = Color.Green, )
        Spacer(modifier = Modifier.width(23.dp))
        Text(text = content)
    }
}

@Preview(showSystemUi = true)
@Composable
fun GreetingPreview() {
    BusinnesCardAppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.Gray
        ) {
            displayer()
        }
    }
}