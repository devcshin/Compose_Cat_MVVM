package com.m2comm.composecatexercise.repository

import com.m2comm.composecatexercise.model.ApiCat
import com.m2comm.composecatexercise.model.Cat
import com.m2comm.composecatexercise.util.ApiMapper
import javax.inject.Inject

class CatMapper @Inject constructor(): ApiMapper<ApiCat, Cat>{
    override fun mapToDomain(input: ApiCat): Cat {
        return Cat(
            id = input.breeds[0].id,
            name = input.breeds[0].name,
            description = input.breeds[0].description,
            lifeSpan = input.breeds[0].lifeSpan,
            origin = input.breeds[0].origin,
            imageUrl = input.url
        )
    }
}