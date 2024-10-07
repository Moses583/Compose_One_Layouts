package com.ravemaster.composeone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.LayoutScopeMarker
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ravemaster.composeone.ui.theme.ComposeOneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeOneTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    Greeting(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column (
        modifier = modifier
            .fillMaxSize()
            .padding(10.dp)
    ){
        LayoutsExample()
        LayoutExample2()
    }
}

@Composable
fun LayoutsExample(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(300.dp)
            .background(MaterialTheme.colorScheme.primary)
    ){
        Text(
            text = "One",
            fontSize = 20.sp,
            modifier = modifier
                .padding(10.dp)
                .align(Alignment.TopStart)
        )
        Text(
            text = "Two",
            fontSize = 20.sp,
            modifier = modifier
                .padding(10.dp)
                .align(Alignment.TopCenter)
        )
        Text(
            text = "Three",
            fontSize = 20.sp,
            modifier = modifier
                .padding(10.dp)
                .align(Alignment.TopEnd)
        )
        Text(
            text = "Four",
            fontSize = 20.sp,
            modifier = modifier
                .padding(10.dp)
                .align(Alignment.CenterStart)
        )
        Text(
            text = "Five",
            fontSize = 20.sp,
            modifier = modifier
                .padding(10.dp)
                .align(Alignment.Center)
        )
        Text(
            text = "Six",
            fontSize = 20.sp,
            modifier = modifier
                .padding(10.dp)
                .align(Alignment.CenterEnd)
        )
        Text(
            text = "Seven",
            fontSize = 20.sp,
            modifier = modifier
                .padding(10.dp)
                .align(Alignment.BottomStart)
        )
        Text(
            text = "Eight",
            fontSize = 20.sp,
            modifier = modifier
                .padding(10.dp)
                .align(Alignment.BottomCenter)
        )
        Text(
            text = "Nine",
            fontSize = 20.sp,
            modifier = modifier
                .padding(10.dp)
                .align(Alignment.BottomEnd)
        )
    }
}

@Composable
fun LayoutExample2(modifier: Modifier = Modifier){
    Column(modifier = modifier
        .background(MaterialTheme.colorScheme.secondary)
        .fillMaxWidth()
        .height(300.dp)
        .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)) {

        Text(text = "Hello world")
        Text(text = "Hello world")
        Text(text = "Hello world")
        Text(text = "Hello world")
        Text(text = "Hello world")


    }
}



@Preview(showSystemUi = true)
@Composable
fun GreetingPreview() {
    ComposeOneTheme {
        Greeting()
    }
}