package io.witchwitch.craft.web.rest

import com.paypal.payments.Refund
import io.witchwitch.core.security.ADMIN
import io.witchwitch.core.service.dto.PaymentDTO
import io.witchwitch.core.web.client.iamport.request.IamportCancelRequest
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import javax.validation.Valid

@RestController
@RequestMapping("/api")
@PreAuthorize("hasRole('$ADMIN')")
class PaymentResource(
) {

    @GetMapping("/payments/{id}")
    fun getPayment(@PathVariable id: String): Mono<PaymentDTO> {
    }

    @PostMapping("/payments/{id}/iamport/cancel")
    fun iamportPaymentCancel(
        @PathVariable id: String,
        @Valid @RequestBody cancelRequest: IamportCancelRequest
    ): Mono<String> {
    }

    @PostMapping("/payments/{id}/paypal/cancel")
    fun paypalPaymentCancel(
        @PathVariable id: String,
        @Valid @RequestBody refund: Refund
    ): Mono<String> {
    }
}
