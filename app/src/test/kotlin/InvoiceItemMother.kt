object InvoiceItemMother {

    fun complete(): InvoiceItem {
        return InvoiceItem(
            amount = 1,
            price = 1234L,
            productName = "The Hitchhiker's Guide to the Galaxy",
            taxFactor = 0.19
        )
    }

    fun withNegativePrice(): InvoiceItem {
        return complete().copy(price = -1234L)
    }
}