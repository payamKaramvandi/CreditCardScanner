package com.example.core.data

import com.example.core.domain.Card

interface CardDataSource {
    suspend fun insertCard(card: Card)
    suspend fun readCard(id:Long):Card
    suspend fun deleteCard(id: Long)
}