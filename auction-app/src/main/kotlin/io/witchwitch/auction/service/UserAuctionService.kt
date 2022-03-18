package io.witchwitch.auction.service

import io.witchwitch.auction.domain.Event
import io.witchwitch.auction.service.dto.UserAuctionDTO
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class UserAuctionService(
) {
    private val cache = mutableMapOf<Event.Type, Flux<Event>>()

    fun getUserAuctionStream(): Flux<UserAuctionDTO> {
    }

    fun findAllByStatus(): Flux<UserAuctionDTO> {
    }

    fun updateUserAuction(): Mono<UserAuctionDTO> {
    }

    fun isUserAuction(): Mono<Boolean> {
    }
}
