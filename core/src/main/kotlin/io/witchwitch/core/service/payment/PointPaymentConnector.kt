package io.witchwitch.core.service.payment

import io.witchwitch.core.domain.payment.Payment
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class PointPaymentConnector(
) : PayGroupConnector {

    override fun createPayment(): Mono<String> {
    }

    override fun paymentComplete(): Mono<Payment> {
    }

    override fun paymentCancel(): Mono<String> {
    }

    private fun getPaymentClient(): PayTypeHandler {
    }
}
