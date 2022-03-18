package io.witchwitch.craft.service

import io.witchwitch.core.service.dto.ProductDTO
import io.witchwitch.craft.domain.UserCollection
import io.witchwitch.craft.service.dto.UserCollectionDTO
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class UserCollectionService(
) {

    fun getStoredCollections(): Flux<UserCollectionDTO> {
    }

    fun getNotStoredCollections(): Flux<ProductDTO> {

    }

    fun findById(): Mono<UserCollectionDTO> {
    }

    fun getStoredProductByUserId(): Mono<Long> {
    }

    fun getStoredCollectionByUserId(): Mono<Long> {
    }

    fun countByUserId(): Mono<Long> {
    }

    fun existsByUserIdAndCollectionId(): Mono<Boolean> {
    }

    fun createUserCollection(): Flux<UserCollection> {
    }

    private fun findEmptyTokenId(): Flux<Int> {
    }
}
