package io.witchwitch.api.service

import io.witchwitch.api.service.dto.ProfileDTO
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class ProfileService(
) {
    fun setProfile(): Mono<ProfileDTO> {
    }

    fun findByUserId(): Mono<ProfileDTO> {
    }

    fun searchProfile(): Flux<ProfileDTO> {
    }

    fun nicknameCheck(): Mono<Boolean> {
    }

    fun findAllByUserIds(): Flux<ProfileDTO> {
    }
}
