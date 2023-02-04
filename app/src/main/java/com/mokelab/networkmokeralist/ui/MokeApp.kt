package com.mokelab.networkmokeralist.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mokelab.networkmokeralist.ui.screen.list.MokeListScreen

@Composable
fun MokeApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.MokeList.route) {
        composable(Screen.MokeList.route) {
            MokeListScreen()
        }
    }
}