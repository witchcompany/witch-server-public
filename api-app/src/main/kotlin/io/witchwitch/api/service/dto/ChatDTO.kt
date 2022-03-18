package io.witchwitch.api.service.dto

import io.witchwitch.api.domain.chat.ChatType
import java.io.Serializable
import java.time.Instant

data class ChatDTO(


) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ChatDTO) return false
        return id == other.id
    }

    override fun hashCode() = 31
}

data class ReadInfo(
)
