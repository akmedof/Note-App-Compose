package com.aslan.notecompose.navigation.destination

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.aslan.notecompose.util.Action
import com.aslan.notecompose.util.Constants

fun NavGraphBuilder.noteComposable(
    navigateToListScreen: (Action) -> Unit
){
    composable(
        route = Constants.NOTE_SCREEN,
        arguments = listOf(navArgument(Constants.NOTE_ARGUMENT_KEY){
            type = NavType.IntType
        })
    ){

    }
}