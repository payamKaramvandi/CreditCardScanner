package com.example.core.interactors

import com.example.core.data.CardRepository

class DeleteCard constructor(private val cardRepository: CardRepository){
    suspend operator fun invoke(id: Long) = cardRepository.deleteCard(id)
}