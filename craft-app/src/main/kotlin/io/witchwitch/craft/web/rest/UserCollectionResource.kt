package io.witchwitch.craft.web.rest

import io.swagger.v3.oas.annotations.Parameter
import io.witchwitch.craft.domain.Metadata
import io.witchwitch.craft.service.dto.UserCollectionDTO
import io.witchwitch.craft.web.rest.vm.MintVM
import org.springdoc.core.converters.models.PageableAsQueryParam
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api")
class UserCollectionResource(
) {

    @PageableAsQueryParam
    @GetMapping("/user-collections")
    fun getUserCollections(
        @RequestParam exist: Boolean,
        @Parameter(hidden = true) pageable: Pageable
    ): Flux<Any> {
    }

    @PageableAsQueryParam
    @GetMapping("/user-collections/main")
    fun getUserCollections(@Parameter(hidden = true) pageable: Pageable): Flux<UserCollectionDTO> {
    }

    @GetMapping("/user-collections/{id}")
    fun getUserCollection(@PathVariable id: String): Mono<UserCollectionDTO> {
    }

    @GetMapping("/user-collections/mint-price")
    fun getRequiredWit(): Mono<Long> {
    }

    @PostMapping("/user-collections/{id}/mint")
    fun mint(@PathVariable id: String, @RequestBody mintVM: MintVM): Flux<Metadata> {
    }

    @GetMapping("/user-collections/{id}/mint")
    fun mintStatus(@PathVariable id: String): Mono<Map<String, String?>> {
    }
}
