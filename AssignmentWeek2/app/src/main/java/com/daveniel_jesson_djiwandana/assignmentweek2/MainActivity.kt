package com.daveniel_jesson_djiwandana.assignmentweek2
import com.daveniel_jesson_djiwandana.assignmentweek2.soal2.Soal2View
import com.daveniel_jesson_djiwandana.assignmentweek2.soal1.Soal1View
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.daveniel_jesson_djiwandana.assignmentweek2.ui.theme.AssignmentWeek2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AssignmentWeek2Theme {
                Soal1View()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AssignmentWeek2Theme {
        Greeting("Android")
    }
}