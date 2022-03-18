package io.witchwitch.api.service

import io.witchwitch.api.service.dto.UserSettingDTO
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class UserSettingService(
) {
    fun getUserSetting(): Mono<UserSettingDTO> {
    }

    fun updateSetting(): Mono<UserSettingDTO> {
    }

    fun findAllByUserIdList(): Flux<UserSettingDTO> {
    }
}
