package io.witchwitch.auction.web.rest

import io.swagger.v3.oas.annotations.Parameter
import io.witchwitch.auction.domain.auction.UserAuction
import io.witchwitch.auction.service.UserAuctionService
import io.witchwitch.auction.service.dto.UserAuctionDTO
import io.witchwitch.core.security.ADMIN
import org.springdoc.core.converters.models.PageableAsQueryParam
import org.springframework.data.domain.Pageable
import org.springframework.http.codec.ServerSentEvent
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api")
class UserAuctionResource(
) {

    @PageableAsQueryParam
    @PreAuthorize("hasRole('$ADMIN')")
    @GetMapping("/user-auctions/refund")
    fun getRefundTargets(
        @RequestParam status: UserAuction.Status,
        @Parameter(hidden = true) pageable: Pageable
    ): Flux<UserAuctionDTO> {
    }

    @PreAuthorize("hasRole('$ADMIN')")
    @PutMapping("/user-auctions/{id}")
    fun updateRefundTarget(@PathVariable id: String): Mono<UserAuctionDTO> {
    }

    @GetMapping("/user-auctions/check")
    fun checkUserAuctions(@RequestParam auctionId: String): Mono<Map<String, Boolean>> {
    }

    @GetMapping("/user-auctions/stream")
    fun getUserAuctionStream(@RequestParam auctionId: String): Flux<ServerSentEvent<UserAuctionDTO>> {
    }
}
