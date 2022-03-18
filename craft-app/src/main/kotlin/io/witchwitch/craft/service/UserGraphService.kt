package io.witchwitch.craft.service

import io.witchwitch.craft.service.dto.FollowingDTO
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class UserGraphService(
) {

    fun findByUserIdAndKeyTypeIsCollection(): Flux<FollowingDTO> {
    }

    fun follow(): Mono<FollowingDTO> {
    }

    fun unfollow(): Mono<Void> {
    }

    fun isFollowing(): Mono<Boolean> {
    }
}
