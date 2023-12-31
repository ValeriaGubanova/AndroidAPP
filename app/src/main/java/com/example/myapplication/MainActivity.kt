package com.example.myapplication


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onPlaced
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import com.example.myapplication.ui.theme.MyApplicationTheme
import  androidx.compose.ui.res.painterResource
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Screen("Android")
                }
            }
        }
    }
}

@Composable
fun Screen(name: String, modifier: Modifier = Modifier) {
    Image(painter = painterResource(id = R.drawable.img),
    contentDescription = "Banner",
    modifier = Modifier
        .size(350.dp)
        .fillMaxWidth())
        Column ( modifier = Modifier
            .width(350.dp)
            .background(color = Color(0xFF050B18))
            .verticalScroll(rememberScrollState()))
        {

        }
//    Text(
//        text = "",
//        modifier = modifier
//    )


}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Screen("Android")
    }
}

