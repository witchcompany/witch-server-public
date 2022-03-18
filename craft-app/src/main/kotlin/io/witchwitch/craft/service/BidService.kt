package io.witchwitch.craft.service

import io.witchwitch.core.service.dto.BidDTO
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class BidService(
) {


    fun getBidStream(): Flux<BidDTO> {
    }

    fun createBid(): Mono<BidDTO> {
    }

    fun findAllByProductIds(): Flux<BidDTO> {
    }

    fun findByProductId(): Mono<BidDTO> {
    }

    fun getAllBidHistory(): Flux<BidDTO> {
    }
}
