package com.example.core.domain

import java.io.Serializable

data class Card(
    val id:Long, //it could be its owner id,an foreign key of owner table
    val owner: String,
    val expiryDate: String,
    val number: String,
    val cvv: String
):Serializable