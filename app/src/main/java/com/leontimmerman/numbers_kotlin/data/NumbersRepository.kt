package com.leontimmerman.numbers_kotlin.data

import com.leontimmerman.numbers_kotlin.service.NumbersApi
import com.leontimmerman.numbers_kotlin.service.NumbersApiService

class NumbersRepository {
    private val numbersApi: NumbersApiService = NumbersApi.createApi()

    fun getRandomNumberTrivia() = numbersApi.getRandomNumberTrivia()
}