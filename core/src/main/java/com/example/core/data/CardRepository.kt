package com.example.core.data

import com.example.core.domain.Card


class CardRepository(private val cardDataSource: CardDataSource) {
    suspend fun insertCard(card: Card) = cardDataSource.insertCard(card = card)
    suspend fun deleteCard(id: Long) = cardDataSource.deleteCard(id = id)
    suspend fun readCard(id: Long) = cardDataSource.readCard(id = id)
}