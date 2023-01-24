package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeArticleWithImage(
                        heading = getString(R.string.article_heading),
                        paragraph1 = getString(R.string.article_paragraph_1),
                        paragraph2 = getString(R.string.article_paragraph_2)
                    )
                }
            }
        }
    }
}

@Composable
fun ComposeArticleWithText(heading: String, paragraph1: String, paragraph2: String) {
    Column {
        Text(
            text = heading,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(all = 16.dp)
        )
        Text(
            text = paragraph1,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = paragraph2,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 16.dp),
        )
    }
}

@Composable
fun ComposeArticleWithImage(heading: String, paragraph1: String, paragraph2: String) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
        )
        ComposeArticleWithText(heading, paragraph1, paragraph2)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeArticleTheme {
        ComposeArticleWithImage(
            heading = "Jetpack Compose tutorial",
            paragraph1 = "Jetpack Compose is a modern toolkit for building native Android UI. " +
                    "Compose simplifies and accelerates UI development on Android " +
                    "with less code, powerful tools, and intuitive Kotlin APIs.",
            paragraph2 =  "In this tutorial, you build a simple UI component " +
                    "with declarative functions. You call Compose functions " +
                    "to say what elements you want and the Compose compiler does " +
                    "the rest. Compose is built around Composable functions. " +
                    "These functions let you define your app\\'s " +
                    "UI programmatically because they let you describe " +
                    "how it should look and provide data dependencies, " +
                    "rather than focus on the process of the UI\\'s construction, " +
                    "such as initializing an element and then attaching it " +
                    "to a parent. To create a Composable function, " +
                    "you add the @Composable annotation to the function name."
        )
    }
}