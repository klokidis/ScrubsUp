package com.example.scrubsup.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scrubsup.R
import com.example.scrubsup.model.Models
import com.example.scrubsup.ui.theme.ScrubsUpTheme

@Composable
fun ChooseList(
    viewModel : ViewModel = ViewModel()
){
    val uiState by viewModel.uiState.collectAsState()
    CardList(uiState.titleBar,viewModel.loadModels(uiState.titleBar))
}

@Composable
fun CardList(topBarName: Int, cardList: List<Models>, modifier: Modifier = Modifier) {
    Scaffold(
        topBar ={
            TopAppBar(LocalContext.current.getString(topBarName))
        }
    ) { it ->
        LazyColumn(contentPadding = it)  {
            items(cardList) { cards ->
                SingleCard(
                    card = cards,
                    modifier = modifier
                        .padding(
                            top = dimensionResource(R.dimen.vertical_card_padding),
                            start = dimensionResource(R.dimen.padding_medium),
                            end = dimensionResource(R.dimen.padding_medium),
                            bottom = dimensionResource(R.dimen.vertical_card_padding)
                        )
                )
            }
        }
    }
}



@Composable
fun SingleCard(card: Models, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxSize()
            .shadow(4.dp, shape = RoundedCornerShape(16.dp))
            .clip(MaterialTheme.shapes.medium)
            .clickable {
            },
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = dimensionResource(R.dimen.elevation_image),
        )) {
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start) {
            Box {
                Image(
                    painter = painterResource(card.imageResourceId),
                    contentDescription = null, //no need
                    modifier = Modifier
                        .size(width = dimensionResource(R.dimen.image_width), height = dimensionResource(R.dimen.image_height))
                        .padding(end = dimensionResource(R.dimen.padding_large))
                        .aspectRatio(1f),
                    contentScale = ContentScale.Crop
                )
            }
            Text(
                text = LocalContext.current.getString(card.stringResourceId),
                modifier = Modifier.padding(start = dimensionResource(R.dimen.padding_medium)),
                style = MaterialTheme.typography.bodyLarge,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardPreview() {
    ScrubsUpTheme {
        ChooseList()
    }
}