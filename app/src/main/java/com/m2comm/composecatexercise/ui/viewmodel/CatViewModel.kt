package com.m2comm.composecatexercise.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.m2comm.composecatexercise.model.CatsState
import com.m2comm.composecatexercise.repository.CatRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class CatViewModel @Inject constructor(private val repository: CatRepository) : ViewModel() {


    val cats: StateFlow<CatsState> get() = repository.cats


}