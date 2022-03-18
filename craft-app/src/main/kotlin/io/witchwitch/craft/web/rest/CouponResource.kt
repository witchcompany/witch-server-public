package io.witchwitch.craft.web.rest

import io.witchwitch.core.security.ADMIN
import io.witchwitch.core.service.dto.ProductDTO
import io.witchwitch.craft.web.rest.vm.CouponVM
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("api")
class CouponResource(
) {

    @PostMapping("/coupons")
    @PreAuthorize("hasRole('$ADMIN')")
    fun createCoupons(
        @RequestParam category: String,
        @RequestParam issuer: String,
        @RequestBody codes: List<String>
    ): Mono<Long> {
    }

    @PostMapping("/coupons/register")
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    fun registerCoupon(@RequestBody couponVM: CouponVM): Flux<ProductDTO> {
    }
}
