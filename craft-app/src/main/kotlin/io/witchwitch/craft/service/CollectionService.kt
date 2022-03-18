package io.witchwitch.craft.service

import io.witchwitch.craft.service.dto.CollectionDTO
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class CollectionService(
) {

    fun findAllBy(): Flux<CollectionDTO> {
    }

    fun findById(): Mono<CollectionDTO> {
    }

    fun findAllByVisible(): Flux<CollectionDTO> {
    }

    fun findByIdAndVisible(): Mono<CollectionDTO> {
    }

    fun findByIds(): Flux<CollectionDTO> {
    }

    fun createCollection(): Mono<CollectionDTO> {
    }

    fun updateCollection(): Mono<CollectionDTO> {
    }

    fun flipVisible(): Mono<Void> {
    }
}
