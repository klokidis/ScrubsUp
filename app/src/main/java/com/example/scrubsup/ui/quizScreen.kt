package com.example.scrubsup.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import com.example.scrubsup.model.Quiz
import com.example.scrubsup.ui.theme.ScrubsUpTheme

@Composable
fun QuizScreen(
    question:Quiz,
    answerCount:Int,
    correctAnswerCount:Int,
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(end = 20.dp, start = 20.dp, top = 10.dp)
){
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 5.dp, end = 5.dp)
    ) {
        Spacer(modifier = Modifier.padding(7.dp))
       Row(
           verticalAlignment = Alignment.CenterVertically,
           horizontalArrangement = Arrangement.Absolute.Center,
           modifier = Modifier.fillMaxWidth()
       ) {
           Spacer(Modifier.weight(1f))
           Text(
               text = stringResource(R.string.question_count, answerCount+1),
               style = MaterialTheme.typography.bodyMedium,
               textAlign = TextAlign.Center,
               modifier = Modifier
                   .padding(horizontal = 10.dp, vertical = 4.dp)
           )
           Spacer(Modifier.weight(0.5f))
               Text(
                   modifier = Modifier
                       .padding(end = 4.dp)
                       .clip(MaterialTheme.shapes.medium)
                       .background(MaterialTheme.colorScheme.onBackground)
                       .padding(horizontal = 10.dp, vertical = 4.dp),
                   text = stringResource(R.string.word_count, correctAnswerCount),
                   style = MaterialTheme.typography.titleMedium,
                   color = MaterialTheme.colorScheme.onPrimary
               )


       }
        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            text = stringResource(question.question),
            style = MaterialTheme.typography.titleMedium,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 4.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.padding(7.dp))
        Image(
            painter = painterResource(question.imageResourceId),
            contentDescription = null,
            modifier = Modifier
                .size(280.dp)
                .padding(dimensionResource(R.dimen.padding_small))
                .aspectRatio(1f),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.padding(7.dp))
        Button(
            modifier = modifier, onClick = { /*TODO*/ }) {
            Text(text = stringResource(id = question.answers[0].first))
        }
        Button(
            modifier = modifier, onClick = { /*TODO*/ }) {
            Text(text = stringResource(id = question.answers[1].first))
        }
        Button(
            modifier = modifier, onClick = { /*TODO*/ }) {
            Text(text = stringResource(id = question.answers[2].first))
        }
        Button(
            modifier = modifier, onClick = { /*TODO*/ }) {
            Text(text = stringResource(id = question.answers[3].first))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Quiz() {
    ScrubsUpTheme {
        QuizScreen(Quiz(0, R.drawable.body, listOf(),0),0,0)
    }
}
