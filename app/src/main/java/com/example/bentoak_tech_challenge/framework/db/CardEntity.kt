package com.example.bentoak_tech_challenge.framework.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CardEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    @ColumnInfo(name = "owner")
    val owner:String,
    @ColumnInfo(name = "expiryDate")
    val expiryDate:String,
    @ColumnInfo(name = "cvv")
    val cvv:String,
    @ColumnInfo(name = "number")
    val number:String
)