package io.witchwitch.craft.web.rest

import io.swagger.v3.oas.annotations.Parameter
import io.witchwitch.craft.service.dto.CollectionDTO
import org.springdoc.core.converters.models.PageableAsQueryParam
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api")
class CollectionResource(
) {

    @PageableAsQueryParam
    @GetMapping("/collections")
    fun getCollections(@Parameter(hidden = true) pageable: Pageable): Flux<CollectionDTO> {
    }

    @GetMapping("/collections/{id}")
    fun getCollection(@PathVariable id: String): Mono<CollectionDTO> {
    }

    @PageableAsQueryParam
    @GetMapping("/collections/following")
    fun getFollowings(@Parameter(hidden = true) pageable: Pageable): Flux<CollectionDTO> {
    }
}
