package io.witchwitch.api.service

import io.witchwitch.api.service.dto.LoginBlockDTO
import io.witchwitch.api.service.dto.LoginBlockLogDTO
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class LoginBlockService(
) {

    fun findAllLoginBlock(): Flux<LoginBlockDTO> {
    }

    fun findLoginBlock(): Mono<LoginBlockDTO> {
    }

    fun loginBlock(): Mono<LoginBlockDTO> {
    }

    fun loginUnBlock(): Mono<Void> {
    }

    fun findLoginBlockLog(): Flux<LoginBlockLogDTO> {
    }
}
