package com.daveniel_jesson_djiwandana.assignmentweek2.soal2

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.TextStyle
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.daveniel_jesson_djiwandana.assignmentweek2.R


@Composable
fun Soal2View() {
    var enjoyed by remember {mutableStateOf("")}
    var spot by remember {mutableStateOf("")}
    var add by remember {mutableStateOf("")}
    val Poppins = FontFamily(
        Font(R.font.poppins_regular, FontWeight.Normal),
        Font(R.font.poppins_medium, FontWeight.Medium),
        Font(R.font.poppins_semibold, FontWeight.SemiBold),
        Font(R.font.poppins_bold, FontWeight.Bold)
    )
    Box (modifier = Modifier.fillMaxSize()) {
        Image(painter= painterResource(R.drawable.aurora),
            contentDescription = "backgroundImage", modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentScale = ContentScale.FillHeight)
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Bottom) {
            Box(
                modifier = Modifier.fillMaxWidth().fillMaxHeight(0.65f).clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)).background(Color(0xFF383C5C)).heightIn(max = 300.dp)
            ) {
                Column(modifier = Modifier.fillMaxSize().padding(horizontal = 20.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("My Travel", color = Color.White, fontFamily= Poppins,fontWeight = FontWeight.Bold, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth().padding(top = 25.dp), fontSize = 35.sp
                        )
                    }
                    Row (modifier = Modifier.fillMaxWidth().padding(top = 10.dp)) {
                        Text("Aurora", color = Color.White, fontFamily= Poppins,fontWeight = FontWeight.Bold, fontSize = 25.sp)
                    }
                    Row (modifier = Modifier.fillMaxWidth().padding(top = 10.dp)) {
                        Text("Tromsø, Norway", color = Color.White, fontFamily= Poppins,fontSize = 25.sp)
                    }
                    Row (modifier = Modifier.fillMaxWidth().padding(top = 10.dp)) {
                        Text("★★★★★ 5.0", color = Color(0xFFFFD166), fontFamily= Poppins,fontSize = 25.sp)
                    }
                    Row (modifier = Modifier.fillMaxWidth().padding(top = 20.dp)) {
                        TextField(
                            value = enjoyed,
                            onValueChange = {enjoyed = it},
                            textStyle = TextStyle(fontFamily = Poppins, fontSize = 15.sp),
                            placeholder = {
                                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterStart) {
                                    Text("What did you enjoy most about your trip?", color = Color.Black, fontFamily= Poppins,textAlign = TextAlign.Center, fontSize = 12.sp)}
                                },
                            modifier = Modifier.height(60.dp).fillMaxWidth().clip(RoundedCornerShape(10.dp)),
                            colors = TextFieldDefaults.colors(
                                focusedContainerColor = Color(0xFFD9ECFF),
                                unfocusedContainerColor = Color(0xFFD9ECFF),
                                focusedTextColor = Color.Black,
                                unfocusedTextColor = Color.Black,
                                focusedPlaceholderColor = Color.Gray,
                                unfocusedPlaceholderColor = Color.Gray
                            )
                        )
                    }
                    Row (modifier = Modifier.fillMaxWidth().padding(top = 15.dp)) {
                        TextField(
                            value = spot,
                            onValueChange = {spot = it},
                            textStyle = TextStyle(fontFamily = Poppins, fontSize = 15.sp),
                            placeholder = {
                                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterStart) {
                                    Text("What was your favorite spot?", color = Color.Black, fontFamily= Poppins,textAlign = TextAlign.Center, fontSize = 12.sp)}
                            },
                            modifier = Modifier.height(60.dp).fillMaxWidth().clip(RoundedCornerShape(10.dp)),
                            colors = TextFieldDefaults.colors(
                                focusedContainerColor = Color(0xFFD9ECFF),
                                unfocusedContainerColor = Color(0xFFD9ECFF),
                                focusedTextColor = Color.Black,
                                unfocusedTextColor = Color.Black,
                                focusedPlaceholderColor = Color.Gray,
                                unfocusedPlaceholderColor = Color.Gray
                            )
                        )
                    }
                    Row (modifier = Modifier.fillMaxWidth().padding(top = 15.dp)) {
                        TextField(
                            value = add,
                            onValueChange = {add = it},
                            textStyle = TextStyle(fontFamily = Poppins, fontSize = 15.sp),
                            placeholder = {
                                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterStart) {
                                    Text("Anything else you'd like to add?", color = Color.Black, fontFamily= Poppins,textAlign = TextAlign.Center,  fontSize = 12.sp)}
                            },
                            modifier = Modifier.height(60.dp).fillMaxWidth().clip(RoundedCornerShape(10.dp)),
                            colors = TextFieldDefaults.colors(
                                focusedContainerColor = Color(0xFFD9ECFF),
                                unfocusedContainerColor = Color(0xFFD9ECFF),
                                focusedTextColor = Color.Black,
                                unfocusedTextColor = Color.Black,
                                focusedPlaceholderColor = Color.Gray,
                                unfocusedPlaceholderColor = Color.Gray
                            )
                        )
                    }
                    Row (horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth().padding(top=15.dp)) {
                        FloatingActionButton (
                            onClick = {},
                            shape = RoundedCornerShape(15.dp),
                            modifier = Modifier.size(60.dp),
                            containerColor = Color(0xFFD9ECFF),
                            contentColor = Color.Black
                        ) {
                            Text("+", fontSize = 40.sp, fontFamily= Poppins,textAlign = TextAlign.Center)
                        }
                    }
                }
            }
        }
    }



}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Soal2Preview() {
    Soal2View()
}