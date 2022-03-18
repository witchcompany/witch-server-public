package io.witchwitch.core.service.payment

import io.witchwitch.core.domain.payment.PayType
import io.witchwitch.core.domain.payment.Payment
import io.witchwitch.core.domain.payment.PaymentRequest
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class CardPaymentConnector(
) : PayGroupConnector {

    override fun createPayment(paymentRequest: PaymentRequest): Mono<String> {
    }

    override fun paymentComplete(payment: Payment): Mono<Payment> {
    }

    override fun paymentCancel(cancelRequest: Any, payType: PayType): Mono<String> {
    }

    private fun getPaymentClient(payType: PayType): PayTypeHandler {
    }
}
