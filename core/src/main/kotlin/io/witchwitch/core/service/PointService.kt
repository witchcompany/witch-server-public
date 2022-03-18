package io.witchwitch.core.service

import io.witchwitch.core.domain.payment.Payment
import io.witchwitch.core.domain.point.Point
import io.witchwitch.core.domain.point.PointDetail
import io.witchwitch.core.service.dto.PointDTO
import io.witchwitch.core.service.payment.PayTypeHandler
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class PointService(
) : PayTypeHandler {

    override fun createPayment(): Mono<String> {
    }

    override fun paymentComplete(): Mono<Payment> {
    }

    override fun paymentCancel(): Mono<String> {
    }

    fun isValid(): Boolean {
    }

    fun findByUserId(): Mono<PointDTO> {
    }

    fun findAllByUserId(): Flux<PointDTO> {
    }

    fun getLockPoints(): Mono<Long> {
    }

    fun getLockPoint(): Mono<Long> {
    }

    @Transactional
    fun plusPoint(
    ): Mono<PointDTO> {
    }

    @Transactional
    fun minusPoint(
    }

    private fun createPlusPoint(
    )

    private fun createPlusPointDetail(): Mono<PointDetail> {
    }

    private fun createMinusPoint(
    )

    private fun createMinusPointDetail(): Flux<PointDetail> {
    }

    private fun initPoint(): Mono<Point> {
    }
}
