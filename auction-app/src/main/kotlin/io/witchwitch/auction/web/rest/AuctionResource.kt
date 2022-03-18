package io.witchwitch.auction.web.rest

import io.swagger.v3.oas.annotations.Parameter
import io.witchwitch.auction.domain.auction.AuctionStatus
import io.witchwitch.auction.service.AuctionService
import io.witchwitch.auction.service.dto.AuctionDTO
import io.witchwitch.auction.service.dto.UserAuctionDTO
import io.witchwitch.auction.web.vm.AuctionUpdateVM
import io.witchwitch.auction.web.vm.AuctionVM
import io.witchwitch.auction.web.vm.UserAuctionVM
import io.witchwitch.core.security.ADMIN
import org.springdoc.core.converters.models.PageableAsQueryParam
import org.springframework.data.domain.Pageable
import org.springframework.http.codec.ServerSentEvent
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class AuctionResource(
) {

    @PreAuthorize("hasRole('$ADMIN')")
    @PostMapping("/auctions")
    fun createAuction(@Valid @RequestBody auctionVM: AuctionVM): Mono<AuctionDTO> {
    }

    @PreAuthorize("hasRole('$ADMIN')")
    @PutMapping("/auctions")
    fun updateAuction(@Valid @RequestBody auctionUpdateVM: AuctionUpdateVM): Mono<AuctionDTO> {
    }

    @PageableAsQueryParam
    @PreAuthorize("hasRole('$ADMIN')")
    @GetMapping("/auctions")
    fun getAllAuctions(
        @Parameter(hidden = true) pageable: Pageable,
    ): Flux<AuctionDTO> {
    }

    @PageableAsQueryParam
    @GetMapping("/auctions/status/{auctionStatus}")
    fun getAllAuctionsByStatus(
        @Parameter(hidden = true) pageable: Pageable,
        @PathVariable auctionStatus: AuctionStatus,
    ): Flux<AuctionDTO> {
        }
    }

    @GetMapping("/auctions/{id}")
    fun getAuction(@PathVariable id: String): Mono<AuctionDTO> {
    }

    @PostMapping("/auctions/{id}/transaction")
    fun createTransaction(
        @PathVariable id: String,
        @RequestBody userAuctionVM: UserAuctionVM
    ): Mono<UserAuctionDTO> {
    }

    @GetMapping("/auctions/{id}/stream")
    fun getAuctionStream(@PathVariable id: String): Flux<ServerSentEvent<AuctionDTO>> {
    }
}
