package com.example.scrubsup.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.scrubsup.R
import com.example.scrubsup.model.Quiz

@Composable
fun QuizScreen(
    question: Quiz,
    answerCount: Int,
    correctAnswerCount: Int,
    onButtonClicked: (Boolean) -> Unit,
    isOver:Boolean,
    goBack:() -> Unit,
    onPlayAgain: () -> Unit,
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(end = 20.dp, start = 20.dp, top = 10.dp)
){
    var enableClick by rememberSaveable { mutableIntStateOf(0) } //MAKE IT VIEWMODEL
    var answer by rememberSaveable { mutableStateOf(false) }

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(start = 5.dp, end = 5.dp)
    ) {
        Spacer(modifier = Modifier.padding(3.dp))
        Row(
           verticalAlignment = Alignment.CenterVertically,
           horizontalArrangement = Arrangement.Absolute.Center,
           modifier = Modifier.fillMaxWidth()
        ) {
           Spacer(Modifier.weight(2f))
           Text(
               text = stringResource(R.string.question_count, answerCount+1),
               style = MaterialTheme.typography.bodyMedium,
               textAlign = TextAlign.Center,
               modifier = Modifier.padding(start = 4.dp)
           )
           Spacer(Modifier.weight(1f))
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
        Spacer(modifier = Modifier.padding(4.dp))
        Text(
            text = stringResource(question.question),
            style = MaterialTheme.typography.titleMedium,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 4.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.padding(4.dp))
        Image(
            painter = painterResource(question.imageResourceId),
            contentDescription = null,
            modifier = Modifier
                .size(280.dp)
                .padding(dimensionResource(R.dimen.padding_small))
                .aspectRatio(1f),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.padding(2.dp))
        Button(
            colors = if (enableClick == 0) {
                ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
            } else {
                if (question.answers[0].second) {
                    ButtonDefaults.buttonColors(containerColor = Color.Green)
                } else {
                    ButtonDefaults.buttonColors(containerColor = Color.Red)
                }
            },
            modifier = modifier, onClick = {
                if (enableClick == 0) {
                    answer = question.answers[0].second
                }
                enableClick = 1
            }) {
            Text(text = stringResource(id = question.answers[0].first),textAlign = TextAlign.Center)

        }
        Button(
            colors = if (enableClick == 0) {
                ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
            } else {
                if (question.answers[1].second) {
                    ButtonDefaults.buttonColors(containerColor = Color.Green)
                } else {
                    ButtonDefaults.buttonColors(containerColor = Color.Red)
                }
            },
            modifier = modifier, onClick = {
                if (enableClick == 0) {
                    answer = question.answers[1].second
                }
                enableClick = 1
            }) {
            Text(text = stringResource(id = question.answers[1].first),textAlign = TextAlign.Center)
        }
        Button(
            colors = if (enableClick == 0) {
                ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
            } else {
                if (question.answers[2].second) {
                    ButtonDefaults.buttonColors(containerColor = Color.Green)
                } else {
                    ButtonDefaults.buttonColors(containerColor = Color.Red)
                }
            },
            modifier = modifier, onClick = {
                if (enableClick == 0) {
                    answer = question.answers[2].second
                }
                enableClick = 1
            }) {
            Text(text = stringResource(id = question.answers[2].first),textAlign = TextAlign.Center)
        }
        Button(
            colors = if (enableClick == 0) {
                ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
            } else {
                if (question.answers[3].second) {
                    ButtonDefaults.buttonColors(containerColor = Color.Green)
                } else {
                    ButtonDefaults.buttonColors(containerColor = Color.Red)
                }
            },
            modifier = modifier, onClick = {
                if (enableClick == 0) {
                    answer = question.answers[3].second
                }
                enableClick = 1
            }) {
            Text(text = stringResource(id = question.answers[3].first),textAlign = TextAlign.Center)
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Absolute.Right,
            modifier = Modifier
                .fillMaxWidth()) {
            Button(
                enabled = enableClick == 1,
                onClick = {
                    onButtonClicked(answer)
                    enableClick = 0
                },
                modifier = Modifier.padding(top = 10.dp, end = 5.dp)
            ) {
                Text(text = stringResource(id = R.string.next))
            }
        }

    }
    if (isOver) {
        FinalScoreDialog(
            score = correctAnswerCount,
            onPlayAgain = { onPlayAgain()},
            onGoBack = {goBack()}
        )
    }
}
@Composable
private fun FinalScoreDialog(
    score: Int,
    onPlayAgain: () -> Unit,
    onGoBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    AlertDialog(
        onDismissRequest = {
            // Dismiss the dialog when the user clicks outside the dialog or on the back
            // button. If you want to disable that functionality, simply use an empty
            // onCloseRequest.
        },
        title = { Text(text = stringResource(R.string.congratulations)) },
        text = { Text(text = stringResource(R.string.you_scored, score)) },
        modifier = modifier,
        dismissButton = {
            TextButton(onClick = onGoBack) {
                Text(text = stringResource(R.string.exit))
            }
        },
        confirmButton = {
            TextButton(onClick = onPlayAgain) {
                Text(text = stringResource(R.string.play_again))
            }
        }
    )
}