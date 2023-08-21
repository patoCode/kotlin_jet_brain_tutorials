package com.f5.models

import kotlinx.serialization.Serializable

var customerStorage = mutableListOf<Customer>()

@Serializable
data class Customer(
    val id: String,
    val firstName: String,
    val lastName: String,
    val email: String
)
