package io.witchwitch.craft.web.rest

import io.swagger.v3.oas.annotations.Parameter
import io.witchwitch.craft.service.dto.BannerDTO
import org.springdoc.core.converters.models.PageableAsQueryParam
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/api")
class BannerResource(
) {

    @PageableAsQueryParam
    @GetMapping("/banners")
    fun getBanners(@Parameter(hidden = true) pageable: Pageable): Flux<BannerDTO> {
    }
}
