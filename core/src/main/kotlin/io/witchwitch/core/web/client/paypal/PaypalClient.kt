package io.witchwitch.core.web.client.paypal

import com.paypal.orders.Order
import com.paypal.orders.PurchaseUnitRequest
import com.paypal.payments.Capture
import io.witchwitch.core.domain.payment.Payment
import io.witchwitch.core.service.payment.PayTypeHandler
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class PaypalClient(
) : PayTypeHandler {

    fun getOrder(): Mono<Order> {
    }

    fun getCapture(): Mono<Capture> {
    }

    override fun createPayment(): Mono<String> {
    }

    override fun paymentComplete(): Mono<Payment> {
    }

    override fun paymentCancel(): Mono<String> {
    }

    fun isValid(): Boolean {
    }

    fun paymentByOrderId(): Mono<Payment> {
    }

    private fun createPurchaseUnit(): List<PurchaseUnitRequest> {
    }
}
