package io.witchwitch.api.service

import io.witchwitch.api.service.dto.UserBlockDTO
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class UserBlockService(
) {

    fun findAllByUserId(): Flux<UserBlockDTO> {
    }

    fun userBlock(): Mono<UserBlockDTO> {
    }
}
