package com.example.scrubsup.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.*
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.res.stringResource
import com.example.scrubsup.R
import com.example.scrubsup.model.Cards

@Composable
fun CardScreen(
    CardsList: List<Cards>,
    currentIndex: Int,
    isQuestionShown: Boolean,
    onAnswerShown: () -> Unit,
    PreviousCard: () -> Unit,
    NextCard: () -> Unit,
) {

    val cardSize = 350.dp // Set the size of the card
    val imageSize = 150.dp

    val fadeInAlpha = fadeIn(
        animationSpec = tween(durationMillis = 500)
    )

    val fadeOutAlpha = fadeOut(
        animationSpec = tween(durationMillis = 500)
    )

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(start = 5.dp, end = 5.dp)
    ) {
        Spacer(modifier = Modifier.height(50.dp))
        Card(
            modifier = Modifier
                .padding(10.dp)
                .size(cardSize),
            elevation = CardDefaults.cardElevation(5.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                AnimatedVisibility(
                    visible = isQuestionShown,
                    enter = fadeInAlpha,
                    exit = fadeOutAlpha
                ) {
                    Box(
                        modifier = Modifier
                            .size(cardSize)
                            .padding(4.dp)
                            .clickable {
                                //Toggle between question and answer when clicking on the card
                                onAnswerShown()
                            }
                    ) {
                        //Display the question on the front side of the card
                        Text(
                            text = stringResource(CardsList[currentIndex].question),
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxSize(),
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 25.sp
                            )
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        //Display image below the question
                        Image(
                            painter = painterResource(id = CardsList[currentIndex].imageResourceId),
                            contentDescription = null,
                            modifier = Modifier
                                .size(imageSize)
                                .align(Alignment.Center),
                            contentScale = ContentScale.Fit
                        )
                        Text(
                            text = stringResource(id = R.string.show_question),
                            modifier = Modifier.align(Alignment.BottomCenter),
                            style = TextStyle(fontSize = 17.sp)
                        )
                    }
                }
                AnimatedVisibility(
                    visible = !isQuestionShown,
                    enter = fadeInAlpha,
                    exit = fadeOutAlpha
                ) {
                    // Display the answer on the back side of the card
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = stringResource(CardsList[currentIndex].answers),
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 30.sp,
                            ),
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally) // Align the text vertically in the box
                                .padding(horizontal = 16.dp) // Add horizontal padding
                                .clickable {
                                    // Toggle visibility to show question again when clicking on the answer
                                    onAnswerShown()
                                }
                        )
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = stringResource(id = R.string.show_question),
                            style = TextStyle(fontSize = 15.sp),
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .padding(5.dp)
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(35.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // Previous button click handler
            Button(
                modifier = Modifier
                    .height(40.dp)
                    .width(127.dp),
                shape = RoundedCornerShape(bottomStart = 10.dp, topEnd = 10.dp),
                onClick = {
                    PreviousCard()
                },
                enabled = currentIndex > 0
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.arrow),
                    contentDescription = null
                )
                Text("Previous")
            }
            // Next button click handler
            Button(
                modifier = Modifier
                    .height(40.dp)
                    .width(127.dp),
                shape = RoundedCornerShape(bottomEnd = 10.dp, topStart = 10.dp),
                onClick = {
                    NextCard()
                },
                enabled = currentIndex < CardsList.size - 1
            ) {
                Text("Next")
                Icon(
                    painter = painterResource(id = R.drawable.arrow2),
                    contentDescription = null
                )
            }
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}