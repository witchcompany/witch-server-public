package io.witchwitch.craft.web.rest

import io.witchwitch.craft.domain.TokenItem
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class MetadataResource(
) {

    @GetMapping("/metadata/{id}")
    fun getTokenItem(@PathVariable id: String): Mono<TokenItem> {
    }
}
