package io.witchwitch.api.web.rest

import io.swagger.v3.oas.annotations.Parameter
import io.witchwitch.api.service.dto.ProfileDTO
import io.witchwitch.api.web.rest.vm.ProfileVM
import io.witchwitch.core.web.rest.constants.CustomHeaders
import org.springdoc.core.converters.models.PageableAsQueryParam
import org.springframework.data.domain.Pageable
import org.springframework.http.server.reactive.ServerHttpResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import javax.validation.Valid

@RestController
@RequestMapping("/api/profile")
class ProfileResource(
) {

    @GetMapping
    fun getProfile(userId: String?): Mono<ProfileDTO> {
    }

    @PutMapping
    fun setProfile(@Valid @RequestBody profileVM: ProfileVM): Mono<ProfileDTO> {
    }

    @PageableAsQueryParam
    @GetMapping("/search")
    fun getAllProfileBySearch(
        @RequestParam(value = "query", defaultValue = "", required = false) query: String,
        @RequestParam(required = true) longitude: Double,
        @RequestParam(required = true) latitude: Double,
        @Parameter(hidden = true) pageable: Pageable,
        @RequestHeader(CustomHeaders.DEVICE_ID) deviceId: String,
        response: ServerHttpResponse
    ): Flux<ProfileDTO> {
    }

    @GetMapping("/check/{nickname}")
    fun nicknameCheck(@PathVariable nickname: String): Mono<Boolean> {
    }

    private fun getHistory(profileDTO: ProfileDTO, userId: String): Mono<ProfileDTO> {
    }
}
