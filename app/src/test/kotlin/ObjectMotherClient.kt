import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ObjectMotherClient {

    @Test
    fun invoice_with_abroad_address() {
        val invoice = InvoiceMother.abroadAddress()
        assertEquals("DE", invoice.address.country)
    }

    @Test
    fun invoice_with_negative_total() {
        val invoice = InvoiceMother.refund()
        val sum = invoice.items.stream().mapToDouble { it.amount * it.price * 1.0 }.sum()
        assertTrue(sum < 0)
    }
}