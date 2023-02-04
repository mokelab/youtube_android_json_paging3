package com.mokelab.networkmokeralist.ui.screen.list

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MokeListScreen() {
    Scaffold { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues))
    }
}