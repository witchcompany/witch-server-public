package io.witchwitch.craft.web.rest

import io.swagger.v3.oas.annotations.Parameter
import io.witchwitch.core.domain.payment.PaymentRequest
import io.witchwitch.core.security.ADMIN
import io.witchwitch.core.service.dto.PointDTO
import io.witchwitch.core.web.rest.vm.PaymentVM
import io.witchwitch.core.web.rest.vm.PointVM
import io.witchwitch.core.web.rest.vm.WitOrderVM
import org.springdoc.core.converters.models.PageableAsQueryParam
import org.springframework.data.domain.Pageable
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class PointResource(
) {

    @GetMapping("/point")
    fun getPoint(): Mono<Map<String, Long>> {
    }

    @PageableAsQueryParam
    @GetMapping("/point/logs")
    fun getPointHistory(@Parameter(hidden = true) pageable: Pageable): Flux<PointDTO> {
    }

    @PostMapping("/wit/pay/charge")
    fun createWitCharge(@Valid @RequestBody orderVM: WitOrderVM): Mono<String> {
    }

    @PostMapping("/wit/pay/charge/rest")
    fun createWitChargeOrder(@Valid @RequestBody orderVM: WitOrderVM): Mono<String> {
    }

    @PostMapping("/wit/pay/charge/complete")
    fun paymentComplete(@Valid @RequestBody paymentVM: PaymentVM): Flux<PointDTO> {
    }

    @GetMapping("/point/lock")
    fun getLockPoints(@RequestParam("product_id", required = false) productId: String?): Mono<Map<String, Long>> {
    }

    @PreAuthorize("hasRole('$ADMIN')")
    @PutMapping("/point/plus")
    fun pointPlus(@RequestBody pointVM: PointVM): Mono<PointDTO> {
    }

    @PreAuthorize("hasRole('$ADMIN')")
    @PutMapping("/point/refund")
    fun pointRefund(@RequestBody pointVM: PointVM): Mono<PointDTO> {
    }

    private fun createPaymentRequestByWitOrderVM(
    ): Mono<PaymentRequest> {
    }
}
