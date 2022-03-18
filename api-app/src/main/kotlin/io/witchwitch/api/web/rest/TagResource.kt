package io.witchwitch.api.web.rest

import io.swagger.v3.oas.annotations.Parameter
import io.witchwitch.api.service.dto.TagDTO
import org.springdoc.core.converters.models.PageableAsQueryParam
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/api")
class TagResource(
) {

    @PageableAsQueryParam
    @GetMapping("/tags/_search")
    fun searchTags(
        @RequestParam("query", required = false, defaultValue = "") query: String,
        @Parameter(hidden = true) pageable: Pageable
    ): Flux<TagDTO> {
    }
}
