package com.m2comm.composecatexercise.repository

import com.m2comm.composecatexercise.api.CatApi
import com.m2comm.composecatexercise.model.Cat
import com.m2comm.composecatexercise.model.CatsState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class CatRepository @Inject constructor(
    private val catApi: CatApi,
    private val catMapper: CatMapper
) {
    private val _cats = MutableStateFlow<CatsState>(CatsState())
    val cats: StateFlow<CatsState>get() = _cats

    suspend fun getCatsList(){
        _cats.emit(
            CatsState(isLoading = true)
        )
        val res = catApi.getCats()
        if(res.isSuccessful && res.body() != null){
            try {
                val cats = res.body()!!.map {
                    catMapper.mapToDomain(it)
                }
                _cats.emit(
                    CatsState(cats = cats)
                )
            }catch (e:Exception) {
                e.printStackTrace()
                _cats.emit(CatsState(isError = true))
            }
        } else {
            _cats.emit(
                CatsState(isError = true)
            )
        }
    }
}