package com.m2comm.composecatexercise.model

data class CatsState(
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val cats: List<Cat> = emptyList()
)
