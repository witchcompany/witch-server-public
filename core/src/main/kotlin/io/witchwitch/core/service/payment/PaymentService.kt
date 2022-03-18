package io.witchwitch.core.service.payment

import io.witchwitch.core.domain.payment.Payment
import io.witchwitch.core.service.dto.PaymentDTO
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class PaymentService(
) {

    fun getPayment(): Mono<PaymentDTO> {
    }

    fun createPayment(): Mono<String> {
    }

    fun paymentComplete(): Mono<Payment> {
    }

    fun paymentCancel(): Mono<String> {
    }

    private fun getConnector(): PayGroupConnector {
        }
    }

    private fun getPaymentByPaymentVM() = when (paymentVM.payType) {
    }
}
