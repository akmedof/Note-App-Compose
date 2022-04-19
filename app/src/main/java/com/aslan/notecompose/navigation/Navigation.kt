package com.aslan.notecompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.aslan.notecompose.navigation.destination.listComposable
import com.aslan.notecompose.navigation.destination.noteComposable
import com.aslan.notecompose.util.Constants.LIST_SCREEN

@Composable
fun SetupNavigation(
    navController: NavHostController
){
    val screen = remember(navController){
        Screens(navController = navController)
    }
    NavHost(navController = navController, startDestination = LIST_SCREEN ){
        listComposable(
            navigateToNoteScreen = screen.note
        )
        noteComposable(
            navigateToListScreen = screen.list
        )
    }
}