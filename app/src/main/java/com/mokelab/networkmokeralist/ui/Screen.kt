package com.mokelab.networkmokeralist.ui

sealed class Screen(val route: String) {
    object MokeList: Screen("list")
}
