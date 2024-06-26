package com.example.scrubsup.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.getValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.stringResource
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.scrubsup.R

@Composable
fun StartingScreen(
    onButtonModels: () -> Unit,
    onButtonQuiz: () -> Unit,
    onButtonCard: () -> Unit,
    ) {
    val scrollState = rememberScrollState()
    val imageSize = 250.dp

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(scrollState),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            contentAlignment = Alignment.Center
        ) {
            val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.animation1))
            LottieAnimation(
                composition = composition,
                modifier = Modifier.size(280.dp),
                iterations = LottieConstants.IterateForever
            )
        }

        CategoryCard(
            title = stringResource(id = R.string.card),
            photo = R.drawable.cards,
            onClick = onButtonCard
        )

        CategoryCard(
            title = stringResource(id = R.string.model_3d),
            photo = R.drawable._d,
            onClick = onButtonModels
        )

        CategoryCard(
            title = stringResource(id = R.string.quiz),
            photo = R.drawable.quiz,
            onClick = onButtonQuiz
        )
    }
}

@Composable
fun CategoryCard(title: String, photo: Int, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 6.dp, bottom = 6.dp)
            .clickable { }
            .shadow(3.dp, shape = RoundedCornerShape(16.dp))
            .clip(MaterialTheme.shapes.medium),
        onClick = onClick,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(7.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(9.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Absolute.Center,
        ) {
            Image(
                painter = painterResource(id = photo),
                contentDescription = null,
                modifier = Modifier
                    .height(75.dp)
                    .width(90.dp)
                    .padding(start = 7.dp, end = 7.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                modifier = Modifier.padding(5.dp),
                text = title,
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            )
        }
    }
}