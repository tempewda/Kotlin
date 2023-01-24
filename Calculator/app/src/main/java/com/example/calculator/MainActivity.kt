package com.example.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.calculator.ui.theme.CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CalculatorUI()
                }
            }
        }
    }
}

@Composable
fun CalculatorUI(name: String = "...................") {
    Column {
        Text(
            text = name,
            fontSize = 10.sp
        )
        Row {
            Text(
                text = "1   ",
                fontSize = 10.sp
            )
            Text(
                text = "2   ",
                fontSize = 10.sp
            )
            Text(
                text = "3   ",
                fontSize = 10.sp
            )
            Text(
                text = "+   ",
                fontSize = 10.sp
            )
        }
        Row {
            Text(
                text = "4   ",
                fontSize = 10.sp
            )
            Text(
                text = "5   ",
                fontSize = 10.sp
            )
            Text(
                text = "6   ",
                fontSize = 10.sp
            )
            Text(
                text = "-   ",
                fontSize = 10.sp
            )
        }
        Row {
            Text(
                text = "7   ",
                fontSize = 10.sp
            )
            Text(
                text = "8   ",
                fontSize = 10.sp
            )
            Text(
                text = "9   ",
                fontSize = 10.sp
            )
            Text(
                text = "x   ",
                fontSize = 10.sp
            )
        }
        Row {
            Text(
                text = "/    ",
                fontSize = 10.sp
            )
            Text(
                text = "0   ",
                fontSize = 10.sp
            )
            Text(
                text = "%  ",
                fontSize = 10.sp
            )
            Text(
                text = "=   ",
                fontSize = 10.sp
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CalculatorTheme {
        CalculatorUI()
    }
}