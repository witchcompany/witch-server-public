package io.witchwitch.craft.web.rest

import io.swagger.v3.oas.annotations.Parameter
import io.witchwitch.core.service.dto.BidDTO
import io.witchwitch.core.web.rest.vm.BidVM
import org.reactivestreams.Publisher
import org.springdoc.core.converters.models.PageableAsQueryParam
import org.springframework.data.domain.Pageable
import org.springframework.http.codec.ServerSentEvent
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class BidResource(
) {
    @GetMapping("/bids/stream")
    fun getBidStream(@RequestParam("product_id") productId: String): Flux<ServerSentEvent<BidDTO>> {
    }

    @GetMapping("/bids")
    @PageableAsQueryParam
    fun getBid(
        @RequestParam("product_id", required = false) productId: String?,
        @RequestParam("collection_id", required = false) collectionId: String?,
        @Parameter(hidden = true) pageable: Pageable
    ): Publisher<BidDTO> {
        }
    }

    @PostMapping("/bids")
    fun createBid(@Valid @RequestBody bidVM: BidVM): Mono<BidDTO> {
    }

    @GetMapping("/bids/history")
    @PageableAsQueryParam
    fun getBidHistory(
        @RequestParam("product_id") productId: String,
        @Parameter(hidden = true) pageable: Pageable,
    ): Flux<BidDTO> {
    }
}
