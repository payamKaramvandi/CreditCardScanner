package com.example.core.interactors

import com.example.core.data.CardRepository
import com.example.core.domain.Card

class InsertCard constructor(private val cardRepository: CardRepository) {
    suspend operator fun invoke(card: Card) = cardRepository.insertCard(card)
}