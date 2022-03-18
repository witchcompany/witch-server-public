package io.witchwitch.api.service

import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class EventService(
) {

    init {
    }

    companion object {
    }

    fun dailyLoginEvent(): Mono<Boolean> {
    }

    fun dailyPostEvent(): Mono<Boolean> {
    }

    fun eventTargetReward() {
    }
}
