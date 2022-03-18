package io.witchwitch.api.service

import com.google.firebase.messaging.AndroidConfig
import com.google.firebase.messaging.ApnsConfig
import com.google.firebase.messaging.BatchResponse
import io.witchwitch.api.domain.Device
import io.witchwitch.api.service.dto.PushLogDTO
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class PushNotificationService(
) {

    fun sendPushNotification(): Mono<BatchResponse> {
    }

    private fun androidConfig(): AndroidConfig? {
    }

    private fun apnsConfig(): ApnsConfig {
    }

    private fun handleFeedback(): Flux<Device> {
    }

    private fun sendMulticastMessage(): Mono<BatchResponse> {
    }

    private fun createPushLog(
    ): Flux<Device> {
    }

    fun getPushLog(): Flux<PushLogDTO> {
    }

    fun getPushLogByPushType(
    ): Flux<PushLogDTO> {
    }

    fun existsEmotionPushLog(
    ): Mono<Boolean> {
    }
}
