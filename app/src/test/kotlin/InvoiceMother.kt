object InvoiceMother {

    fun complete(): Invoice {
        return Invoice(
            id = 42L,
            address = AddressMother.complete(),
            items = listOf(InvoiceItemMother.complete())
        )
    }

    fun refund(): Invoice {
        return complete().copy(items = listOf(InvoiceItemMother.withNegativePrice()))
    }

    fun abroadAddress(): Invoice {
        return complete().copy(address = AddressMother.abroad())
    }
}