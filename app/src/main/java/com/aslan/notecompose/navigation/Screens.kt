package com.aslan.notecompose.navigation

import androidx.navigation.NavHostController
import com.aslan.notecompose.util.Action
import com.aslan.notecompose.util.Constants.LIST_SCREEN

class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navController.navigate(route = "list/${action.name}"){
            popUpTo(LIST_SCREEN){inclusive = true}
        }
    }
    val note: (Int) -> Unit = {noteId ->
        navController.navigate(route = "note/${noteId}")
    }
}