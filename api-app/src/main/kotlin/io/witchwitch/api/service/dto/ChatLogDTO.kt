package io.witchwitch.api.service.dto

import io.witchwitch.api.domain.chat.ChatLogType
import io.witchwitch.api.domain.chat.extra.ChatLogExtra
import java.io.Serializable
import java.time.Instant

data class ChatLogDTO(


) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ChatLogDTO) return false
        return id == other.id
    }

    override fun hashCode() = 31
}
