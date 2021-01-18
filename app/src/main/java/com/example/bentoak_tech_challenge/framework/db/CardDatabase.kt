package com.example.bentoak_tech_challenge.framework.db

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

abstract class CardDatabase : RoomDatabase() {
    companion object {
        private const val DATABASE_NAME = "card.db"
        private var instance :CardDatabase? =null

        private fun create(context: Context): CardDatabase =
            Room.databaseBuilder(context, CardDatabase::class.java, DATABASE_NAME)
                .fallbackToDestructiveMigration()
                .build()
        fun getInstance(context: Context): CardDatabase =
            (instance ?: create(context)).also { instance = it }
    }

}