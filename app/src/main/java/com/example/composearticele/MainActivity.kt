package com.example.composearticele

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticele.ui.theme.ComposeArticeleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticeleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TutorialPage()
                }
            }
        }
    }
}

@Composable
fun TutorialPage(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        HeaderImage()
        TextArticle()
    }
}

@Composable
fun HeaderImage(modifier: Modifier = Modifier) {
    Image(painter = painterResource(id = R.drawable.bg_compose_background), contentDescription = null, modifier = Modifier.fillMaxWidth())
}

@Composable
fun TextArticle(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(stringResource(R.string.tutorial_title), fontSize = 24.sp, modifier = Modifier.padding(16.dp))
        Text(stringResource(R.string.tutorial_paragraph_1), modifier = Modifier.padding(horizontal = 16.dp), textAlign = TextAlign.Justify)
        Text(stringResource(R.string.tutorial_paragraph_2), modifier = Modifier.padding(16.dp), textAlign = TextAlign.Justify)
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeArticeleTheme {
        TutorialPage()
    }
}