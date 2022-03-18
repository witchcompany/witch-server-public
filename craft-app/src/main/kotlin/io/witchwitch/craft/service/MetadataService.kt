package io.witchwitch.craft.service

import io.witchwitch.craft.domain.Metadata
import io.witchwitch.craft.domain.TokenItem
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class MetadataService(
) {

    fun findById(): Mono<Metadata> {
    }

    fun createMetadata(): Mono<Metadata> {
    }

    private fun createTokenItem(): Mono<TokenItem> {
    }

    fun updateTransaction(): Mono<Metadata> {
    }
}
