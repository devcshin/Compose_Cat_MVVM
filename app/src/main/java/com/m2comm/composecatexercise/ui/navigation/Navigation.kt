package com.m2comm.composecatexercise.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

const val CAT_LIST_SCREEN = "Cat List screen"
const val CAT_DETAIL_SCREEN = "Cat Detail screen"

@Composable
fun MainNav(){

    val navHostController = rememberNavController()

    NavHost(navController = navHostController, startDestination = CAT_LIST_SCREEN) {
        composable(CAT_LIST_SCREEN){

        }
        composable(CAT_DETAIL_SCREEN){

        }
    }

}