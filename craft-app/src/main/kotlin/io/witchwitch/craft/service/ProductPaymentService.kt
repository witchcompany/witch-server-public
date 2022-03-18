package io.witchwitch.craft.service

import io.witchwitch.core.service.dto.ProductDTO
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional
import reactor.core.publisher.Flux

@Service
class ProductPaymentService(
) {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    fun onPaymentComplete(): Flux<ProductDTO> {
    }
}
