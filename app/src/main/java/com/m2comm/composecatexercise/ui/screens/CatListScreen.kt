package com.m2comm.composecatexercise.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.m2comm.composecatexercise.model.CatsState
import com.m2comm.composecatexercise.ui.viewmodel.CatViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch


@Composable
fun CatListScreen(
    navHostController: NavHostController
){
    val viewModel: CatViewModel = hiltViewModel()
    val catsState: CatsState by viewModel.cats.collectAsState() //import androidx.compose.runtime.getValue

    val coroutineScope = rememberCoroutineScope()
    val onRefresh: () -> Unit = {
        coroutineScope.launch {
            viewModel.getCats()
        }
    }


}