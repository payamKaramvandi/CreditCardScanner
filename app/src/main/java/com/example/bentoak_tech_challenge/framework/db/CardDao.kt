package com.example.bentoak_tech_challenge.framework.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.example.core.domain.Card

@Dao
interface CardDao {

    @Insert(onConflict = REPLACE)
    suspend fun addCard(card:CardEntity)

    @Delete(entity = CardEntity::class)
    suspend fun deleteCard(id:Long)

    @Query("SELECT * FROM CardEntity WHERE id = :cardId")
    suspend fun readCard(cardId:Long):CardEntity

}