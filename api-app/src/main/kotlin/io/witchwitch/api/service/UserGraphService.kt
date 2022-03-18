package io.witchwitch.api.service

import io.witchwitch.api.domain.Followers
import io.witchwitch.api.domain.Following
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class UserGraphService(
) {
    fun countFollowers(): Mono<Long> {
    }

    fun findAllFollowers(): Flux<Followers> {
    }

    fun countFollowing(): Mono<Long> {
    }

    fun findAllFollowing(): Flux<Following> {
    }

    fun isFollowing(): Mono<Boolean> {
    }

    fun follow(): Mono<Void> {
    }

    fun unfollow(): Mono<Void> {
    }
}
