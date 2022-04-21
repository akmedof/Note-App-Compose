package com.aslan.notecompose.navigation.destination

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.aslan.notecompose.ui.screens.list.ListScreen
import com.aslan.notecompose.util.Constants.LIST_ARGUMENT_KEY
import com.aslan.notecompose.util.Constants.LIST_SCREEN

fun NavGraphBuilder.listComposable(
    navigateToNoteScreen: (taskId: Int) -> Unit
){
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY){
            type = NavType.StringType
        })
    ){
        ListScreen(navigateToNoteScreen = navigateToNoteScreen)
    }
}