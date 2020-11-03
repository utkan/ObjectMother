object AddressMother {

    fun complete(): Address {
        return Address(
            street = "Hollywood Boulevard",
            houseNumber = "4711",
            zipCode = "90210",
            country = "US",
            city = "Los Angeles"
        )
    }

    fun abroad(): Address {
        return complete().copy(country = "DE")
    }
}