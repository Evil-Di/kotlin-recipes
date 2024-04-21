package ru.otus.homework

import kotlin.random.Random

fun main() {
    val address: Address = Address().also {
        it.street1 = "Ul. Lenina, d. 10"
        it.street2 = "Kv. 10"
        it.city = "Borok"
        it.country = "Russia"
        it.index = "12345"
    }

    val addressString: String = address
        .let { "${it.street1}, ${it.street2}, ${it.city}, ${it.country}, ${it.index}" }
        .apply { println("Address length: $length") }

    println(address)
    println(addressString)
}

class Address {
    lateinit var street1: String
    lateinit var street2: String
    lateinit var city: String
    lateinit var country: String
    lateinit var index: String
}