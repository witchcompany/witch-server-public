package io.witchwitch.craft.web.rest

import io.swagger.v3.oas.annotations.Parameter
import io.witchwitch.craft.service.dto.AuctioneerDTO
import org.springdoc.core.converters.models.PageableAsQueryParam
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/api")
class AuctioneerResource(
) {

    @GetMapping("/auctioneers/history")
    @PageableAsQueryParam
    fun getAuctioneers(
        @RequestParam("product_id") productId: String,
        @Parameter(hidden = true) pageable: Pageable
    ): Flux<AuctioneerDTO> {
    }
}
