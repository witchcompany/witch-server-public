package io.witchwitch.craft.service

import io.witchwitch.core.domain.payment.PaymentRequest
import io.witchwitch.core.domain.product.Product
import io.witchwitch.core.service.dto.ProductDTO
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class ProductService(
) {

    fun findAllBy(): Flux<ProductDTO> {
    }

    fun findAllByVisible(): Flux<ProductDTO> {
    }

    fun createProduct(): Mono<ProductDTO> {
    }

    fun updateProduct(): Mono<ProductDTO> {
    }

    fun flipVisible(): Mono<Void> {
    }

    private fun createProductTag(): Mono<Product> {
    }

    fun findById(): Mono<ProductDTO> {
    }

    fun findByIdAndVisible(): Mono<ProductDTO> {
    }

    private fun addOwnerToTheProduct(): Mono<ProductDTO> {
    }

    private fun changeStatusToTheProduct(): Mono<ProductDTO> {
    }

    fun findAllByIds(): Flux<ProductDTO> {
    }

    fun findRandomProduct(): Mono<ProductDTO> {
    }

    fun deleteProduct(): Mono<Void> {
    }

    fun subtractProductCount(): Mono<ProductDTO> {
    }

    fun countByProducts(): Mono<Long> {
    }

    fun findByProductType(): Flux<ProductDTO> {
    }

    fun findAllBySearch(
    ): Flux<ProductDTO> {
    }

    fun findAllByCollectionId(): Flux<ProductDTO> {
    }

    fun findAllByCollectionId(): Flux<ProductDTO> {
    }

    fun findAllByStatus(): Flux<ProductDTO> {
    }

    fun createPaymentRequestByOrder(
    ): Mono<PaymentRequest> {
    }
}
