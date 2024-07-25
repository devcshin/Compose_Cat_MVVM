package com.m2comm.composecatexercise.ui.screens

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.m2comm.composecatexercise.ui.viewmodel.CatViewModel
import dagger.hilt.android.lifecycle.HiltViewModel


@Composable
fun CatListScreen(
    navHostController: NavHostController
){
    val viewModel: CatViewModel = hiltViewModel()

}