package io.witchwitch.api.service

import io.witchwitch.api.domain.chat.Chat
import io.witchwitch.api.domain.chat.UserChat
import io.witchwitch.api.service.dto.ChatDTO
import io.witchwitch.api.service.dto.ChatLogDTO
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class ChatService(
) {

    @Transactional
    fun createOneToOneChat(
    ): Mono<ChatDTO> {
    }

    @Transactional
    fun write(): Mono<ChatLogDTO> {
    }

    @Transactional
    fun leave(): Mono<Void> {
    }

    fun chatIn(): Mono<ChatDTO> {
    }

    @Transactional
    fun chatOut(): Mono<ChatDTO> {
    }

    fun getOneChat(): Mono<ChatDTO> {
    }

    fun getChats(): Flux<ChatDTO> {
    }

    fun getChatLogs(
    ): Flux<ChatLogDTO> {
    }

    private fun updateUserChat(
    ): Mono<UserChat> {
    }

    private fun updateChat(
    ): Mono<Chat> {
    }

    private fun createChat(
    )

    private fun writeInternal(
    )

    private fun createOneToOneUserChat(
    ): Flux<UserChat> {
    }
}
