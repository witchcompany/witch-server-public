package io.witchwitch.craft.service

import io.witchwitch.craft.domain.Coupon
import io.witchwitch.craft.domain.CouponInput
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import reactor.core.publisher.Mono

@Service
class CouponService(
) {

    @Transactional
    fun registerCoupon(): Mono<Coupon> {
    }

    fun findByCodeAndType(): Mono<Coupon> {
    }

    fun availableCouponCheck(): Mono<Coupon> {
    }

    fun createCoupon(): Mono<Long> {
    }

    private fun createCouponInput(): Mono<CouponInput> {
    }

    private fun abuserCheck(): Mono<Boolean> {
    }
}
