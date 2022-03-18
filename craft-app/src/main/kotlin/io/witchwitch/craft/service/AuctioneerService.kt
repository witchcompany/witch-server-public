package io.witchwitch.craft.service

import io.witchwitch.craft.service.dto.AuctioneerDTO
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class AuctioneerService(
) {

    fun findByProductId(): Flux<AuctioneerDTO> {
    }

    fun createAuctioneer(
    ): Mono<AuctioneerDTO> {
    }
}
