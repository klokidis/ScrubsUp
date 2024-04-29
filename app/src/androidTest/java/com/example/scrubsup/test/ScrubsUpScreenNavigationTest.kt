package com.example.scrubsup.test

import org.junit.Rule
import androidx.activity.ComponentActivity
import androidx.navigation.testing.TestNavHostController
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.performClick
import androidx.navigation.compose.ComposeNavigator
import com.example.scrubsup.R
import com.example.scrubsup.ScrubScreen
import com.example.scrubsup.ScrubsUpApp
import org.junit.Before
import org.junit.Test

class ScrubsUpScreenNavigationTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    private lateinit var navController: TestNavHostController
    @Before // runs before the @test
    fun setupCupcakeNavHost() {
        composeTestRule.setContent {
            navController = TestNavHostController(LocalContext.current).apply {
                navigatorProvider.addNavigator(ComposeNavigator())
            }
            ScrubsUpApp(navController = navController)
        }
    }

    @Test
    fun scrubsUpNavHost_verifyStartDestination() {
        navController.assertCurrentRouteName(ScrubScreen.Start.name)
    }
    @Test
    fun scrubsUpNavHost_verifyBackNavigationNotShownOnStartOrderScreen() {
        val backText = composeTestRule.activity.getString(R.string.previous_button)
        composeTestRule.onNodeWithContentDescription(backText).assertDoesNotExist()
    }

    @Test
    fun scrubsUpNavHost_clickMemoryCards_navigatesToChooseList(){
        navigateToChooseListCards()
        navController.assertCurrentRouteName(ScrubScreen.ChooseCard.name)
    }
    @Test
    fun scrubsUpNavHost_clickModels_navigatesToChooseModels(){
        navigateToChooseListModels()
        navController.assertCurrentRouteName(ScrubScreen.ChooseModels.name)
    }
    @Test
    fun scrubsUpNavHost_clickCardsCategory_navigatesCards(){
        navigateToChooseListCards()
        composeTestRule.onNodeWithStringId(R.string.Arterial_vessel).performClick()
        navController.assertCurrentRouteName(ScrubScreen.Card.name)
    }
    @Test
    fun scrubsUpNavHost_clickPrevButtonOnChooseModel_navigatesToStart(){
        navigateToChooseListModels()
        performNavigateUp()
        navController.assertCurrentRouteName(ScrubScreen.Start.name)
    }
    private fun navigateToChooseListCards() {
        composeTestRule.onNodeWithStringId(R.string.card).performClick()
    }
    private fun navigateToChooseListModels() {
        composeTestRule.onNodeWithStringId(R.string.model_3d).performClick()
    }
    /*
    private fun navigateToChooseListQuiz() {
        composeTestRule.onNodeWithStringId(R.string.quiz).performClick()
    }

    private fun navigateToQuiz() {
        navigateToChooseListQuiz()
        composeTestRule.onNodeWithStringId(R.string.neurology).performClick()
    }
    */
    private fun performNavigateUp() {
        val backText = composeTestRule.activity.getString(R.string.previous_button)
        composeTestRule.onNodeWithContentDescription(backText).performClick()
    }
}

