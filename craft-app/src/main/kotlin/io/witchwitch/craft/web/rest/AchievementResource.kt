package io.witchwitch.craft.web.rest

import io.swagger.v3.oas.annotations.Parameter
import org.springdoc.core.converters.models.PageableAsQueryParam
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.Locale

@RestController
@RequestMapping("/api")
class AchievementResource(
) {

    @PageableAsQueryParam
    @GetMapping("/achievements")
    fun getAchievementsByCollectionId(
        locale: Locale?,
        @Parameter(hidden = true) pageable: Pageable
    ): Flux<Map<String, String>> {
    }

    private fun getMessage(): Mono<String> {
        }
    }
}
