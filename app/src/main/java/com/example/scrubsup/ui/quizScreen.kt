package com.example.scrubsup.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scrubsup.R
import com.example.scrubsup.ui.theme.ScrubsUpTheme

@Composable
fun QuizScreen(modifier: Modifier = Modifier
    .fillMaxWidth()
    .padding(end = 20.dp, start = 20.dp, top = 20.dp)){
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 5.dp, end = 5.dp)
    ) {
        Text(
            modifier = Modifier
                .clip(MaterialTheme.shapes.medium)
                .background(MaterialTheme.colorScheme.onBackground)
                .padding(horizontal = 10.dp, vertical = 4.dp)
                .align(alignment = Alignment.End),
            text = stringResource(R.string.word_count, 0),
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onPrimary
        )
        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            text = "Question 0 out of 20",
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 4.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = "THATS A VERY BIG QUESTION HERE FOR YOU TO ANSER RIGHT NOW",
            style = MaterialTheme.typography.titleMedium,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 4.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.padding(20.dp))
        Image(
            painter = painterResource(id = R.drawable.blood),
            contentDescription = null,
            modifier = Modifier
                .size(180.dp)
                .padding(dimensionResource(R.dimen.padding_small))
                .aspectRatio(1f),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.padding(10.dp))
        Button(
            modifier = modifier, onClick = { /*TODO*/ }) {

        }
        Button(
            modifier = modifier, onClick = { /*TODO*/ }) {

        }
        Button(
            modifier = modifier, onClick = { /*TODO*/ }) {

        }
        Button(
            modifier = modifier, onClick = { /*TODO*/ }) {

        }
    }
}

@Preview(showBackground = true)
@Composable
fun Quiz() {
    ScrubsUpTheme {
        QuizScreen()
    }
}
