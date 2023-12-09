package com.example.bussinesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bussinesscardapp.ui.theme.BussinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BussinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colorResource(id = R.color.bg_color)
                ) {
                   ContainerSection()
                }
            }
        }
    }
}

@Composable
fun ContainerSection(){
    Column(
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BannerSection()
        ContactSection()
    }
}

@Composable
fun BannerSection(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(id = R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier
                .background(color = colorResource(id = R.color.bg_color_image))
                .size(100.dp)

        )
        Text(
            text = stringResource(R.string.name_text),
            fontFamily = FontFamily.SansSerif,
            fontSize = 38.sp,
            fontWeight = FontWeight.Light,
            textAlign = TextAlign.Center,
            color = Color.Black,
            modifier = modifier
                .padding(5.dp)
        )
        Text(
            text = stringResource(R.string.title_text),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.text_color_green),
            modifier = modifier
                .padding(5.dp),

            )
    }

}

@Composable
fun ContactSection(modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {
        Row(modifier.padding(top = 10.dp)) {
            Icon(
                imageVector = Icons.Rounded.Phone,
                contentDescription = null,
                tint = colorResource(id = R.color.text_color_green),
                modifier = modifier
                    .padding(end = 10.dp)
            )
            Text(
                text = stringResource(R.string.phone_text),
                color = Color.Black
            )
        }
        Row(modifier.padding(top = 10.dp)) {
            Icon(
                imageVector = Icons.Rounded.Share,
                contentDescription = null,
                tint = colorResource(id = R.color.text_color_green),
                modifier = modifier
                    .padding(end = 10.dp)
            )
            Text(
                text = stringResource(R.string.share_text),
                color = Color.Black
            )
        }
        Row(modifier.padding(top = 10.dp)) {
            Icon(
                imageVector = Icons.Rounded.Email,
                contentDescription = null,
                tint = colorResource(id = R.color.text_color_green),
                modifier = modifier
                    .padding(end = 10.dp)
            )
            Text(
                text = stringResource(R.string.email_text),
                color = Color.Black
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BussinessCardAppTheme {
        ContactSection()
    }
}