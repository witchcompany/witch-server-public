package io.witchwitch.api.service

import io.witchwitch.api.service.dto.UserLocationDTO
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class LocationService(
) {

    fun updateLocation(): Mono<UserLocationDTO> {
    }

    fun findUserLocationByNear(
    ): Flux<UserLocationDTO> {
    }

    fun findAllByUserId(): Flux<UserLocationDTO> {
    }

    fun findSetting(): Mono<UserLocationDTO> {
    }

    fun updateSetting(): Mono<UserLocationDTO> {
    }
}
