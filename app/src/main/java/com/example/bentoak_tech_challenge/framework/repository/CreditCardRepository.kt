package com.example.bentoak_tech_challenge.framework.repository

import com.example.bentoak_tech_challenge.framework.db.CardDao
import com.example.bentoak_tech_challenge.framework.db.CardEntity
import com.example.core.data.CardDataSource
import com.example.core.domain.Card
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CreditCardRepository @Inject constructor(
    private val cardDao: CardDao
) : CardDataSource {
    override suspend fun insertCard(card: Card) {
        cardDao.addCard(card.let {
            CardEntity(
                it.id,
                it.owner,
                it.expiryDate,
                it.cvv,
                it.number
            )
        })
    }

    override suspend fun readCard(id: Long): Card {
        return cardDao.readCard(id).let {
            Card(
                it.id, it.owner, it.expiryDate, it.number, it.cvv
            )
        }
    }

    override suspend fun deleteCard(id: Long) {
        return cardDao.deleteCard(id)
    }

}