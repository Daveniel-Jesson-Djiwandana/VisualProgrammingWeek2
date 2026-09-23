package com.daveniel_jesson_djiwandana.assignmentweek2


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Soal1View() {
    Column (
        Modifier.fillMaxHeight().background(Color(0xFFFFA4A5)).padding(top = 40.dp).padding(horizontal=50.dp)
    ){
        Row (
        ){
            Column(
                Modifier.fillMaxWidth().weight(0.5f),
                horizontalAlignment = Alignment.Start
            ) {
                Text("V",
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp)
            }
            Column (
                Modifier.fillMaxWidth().weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text("Liked Songs",
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp)
            }
            Column (
                Modifier.fillMaxWidth().weight(0.5f),
                horizontalAlignment = Alignment.End
            ) {
                Text("...",
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp)
            }
        }
        Row (
            Modifier.fillMaxWidth().padding(top = 15.dp), horizontalArrangement = Arrangement.Center
        ){
                Image(painter= painterResource(R.drawable.album_cover),
                    contentDescription = "albumCover", modifier = Modifier.fillMaxWidth(), contentScale = ContentScale.FillWidth)
        }
        Row (
            Modifier.fillMaxWidth().padding(top = 15.dp), verticalAlignment = Alignment.CenterVertically
        ) {
            Column (
                Modifier.weight(1f),
            ){
                Row {
                    Text("Television /\nSo Far So Good",
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp)
                }
                Row {
                    Text("Rex Orange", fontSize = 20.sp)
                }
            }
            Column (
            ){
                Text("♥\uFE0E", fontSize = 45.sp, color = Color.Black)
            }
        }
        Row (
            Modifier.padding(top=15.dp)
        ) {
           Box (Modifier.fillMaxWidth().height(2.dp).background(Color.Black))
        }
        Row(Modifier.fillMaxWidth().padding(top= 3.dp), horizontalArrangement = Arrangement.SpaceBetween) {
            Text("0:12")
            Text("-2:14")
        }
        Row(
            Modifier.fillMaxWidth().padding(top = 15.dp), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically
        ) {
            Text("⏮\uFE0E", fontSize = 45.sp, color = Color.Black)
            Box (Modifier.offset(y = 7.dp)) {
                Box(
                    Modifier.size(55.dp).clip(CircleShape).background(Color.Black),
                    contentAlignment = Alignment.Center
                ) {
                    Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                        Box(Modifier.size(width = 5.dp, height = 20.dp).background(Color.White))
                        Box(Modifier.size(width = 5.dp, height = 20.dp).background(Color.White))
                    }
                }
            }

            Text("⏭\uFE0E", fontSize = 45.sp, color = Color.Black)
        }
        Row (
            Modifier.fillMaxWidth().padding(top = 15.dp)
        ) {
            Box(
                Modifier.fillMaxWidth().clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)).background(Color(0xFF430F0A)).heightIn(max = 300.dp)
            ) {
                Column(Modifier.padding(7.dp)) {
                    Text("Lyrics", Modifier.padding(top = 20.dp,start = 20.dp, end = 20.dp), color=Color.White, fontWeight = FontWeight.Bold, fontSize= 15.sp)
                    Column (Modifier.verticalScroll(rememberScrollState()).padding(bottom = 20.dp,start = 20.dp, end = 20.dp, top = 2.dp)){
                        Text("""Hey, I'm not afraid
I can be myself, and I
Hope you can be yourself as well
'Cause I can make you feel alright
And there was so much happiness
That we were still yet to find
I said that, "You can call me Alex, baby
Welcome to my life"
But don't you worry
Don't you, don't worry, girl
No, I'm not sure if I'm into you
The last time that you checked, I was probably
So sad and confused
I don't know, no
I don't know what you like
But if you're looking for something new
I know somebody that you could choose
What about me?
What about me?
What about me and you together?
Something that could really last forever
What about me?
What about me? Yeah
What about me and you together?
Something that could really last forever
If all my friends wanna be in her bed
Then I begin to wonder why
I guess that I'd be lying to myself
'Cause who the fuck would be dumb enough
To reject an offer? Oh, what an offer?
Now two, two, ten, one, five
Couple hours can change your life
Frankie saying, "Oh, what a night, what a night"
What the fuck is a girlfriend? I'ma need advice
Maybe I should go outside so I can get a fucking life
I made a friend and she spent the night now
I'm in love and she remains in my life
And back when we spoke in Europe
I need insurance on my emotions
I can't get hurt again
Fuck the past, fuck them, they all made me sad
And I had no time to prepare to face my fears
I guess that it's time that I dried these tears
But if I could just be happy by the end of this song
But if by the time you hear it you are already gone
And it didn't go to plan
Then why should I continue in this life
When there's no one around to be the one who makes me smile?
So far everything's good
Ooh (oh, oh)
Oh-oh, oh-oh
Well, I said, so far everything's good
Oh-oh (ooh)
Oh, no, no
No, no, no, no
No, oh, oh
Want the crowd in tears when they hear this
Is that so wrong?""", color = Color.White, fontSize = 15.sp)
                }

                }
            }
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Soal1Preview() {
    Soal1View()
}