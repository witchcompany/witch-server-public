package io.witchwitch.api.service

import io.witchwitch.api.service.dto.DeviceDTO
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class DeviceService(
) {
    fun save(): Mono<DeviceDTO> {
    }

    fun findOne(): Mono<DeviceDTO> {
    }

    fun findByToken(): Mono<DeviceDTO> {
    }

    fun deleteByUserIdAndToken(): Mono<Void> {
    }

    fun findByUserIdAndDeviceId(): Mono<DeviceDTO> {
    }

    fun findByUserId(): Flux<DeviceDTO> {
    }
}
