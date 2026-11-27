package com.example.questapi_0267.uicontroller

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questapi_0267.uicontroller.route.DestinasiEntry
import com.example.questapi_0267.uicontroller.route.DestinasiHome
import com.example.questapi_0267.view.HalamanEntry
import com.example.questapi_0267.view.HalamanHome

@Composable
fun DataSiswaApp(navController: NavHostController = rememberNavController(), modifier: Modifier = Modifier) {
    HostNavigasi(navController = navController, modifier = modifier)
}

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = modifier
    ) {
        composable(DestinasiHome.route) {
            HalamanHome(navigateToItemEntry = { navController.navigate(DestinasiEntry.route) })
        }
        composable(DestinasiEntry.route) {
            HalamanEntry(navigateBack = { navController.popBackStack() })
        }
    }
}