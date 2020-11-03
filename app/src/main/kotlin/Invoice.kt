data class Invoice(
    val id: Long,
    val address: Address,
    val items: List<InvoiceItem>
)
