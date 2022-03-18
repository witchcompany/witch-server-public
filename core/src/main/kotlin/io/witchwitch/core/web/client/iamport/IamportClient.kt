package io.witchwitch.core.web.client.iamport

import io.witchwitch.core.domain.payment.Payment
import io.witchwitch.core.service.payment.PayTypeHandler
import io.witchwitch.core.web.client.iamport.response.IamportResponse
import io.witchwitch.core.web.client.iamport.response.PaymentResponse
import io.witchwitch.core.web.client.iamport.response.TokenResponse
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class IamportClient(
) : PayTypeHandler {

    override fun createPayment(): Mono<String> {
    }

    override fun paymentComplete(): Mono<Payment> {
    }

    override fun paymentCancel(): Mono<String> {
    }

    fun isValid(): Boolean {
    }

    fun getPaymentResponse(): Mono<IamportResponse<PaymentResponse>> {
    }

    private fun getAccessToken(): Mono<IamportResponse<TokenResponse>> {
    }
}
