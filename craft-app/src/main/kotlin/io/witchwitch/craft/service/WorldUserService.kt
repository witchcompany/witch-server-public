package io.witchwitch.craft.service

import io.witchwitch.craft.domain.WorldUser
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class WorldUserService(
) {

    fun findById(): Mono<WorldUser> {
    }

    fun saveUser(): Mono<WorldUser> {
    }
}
