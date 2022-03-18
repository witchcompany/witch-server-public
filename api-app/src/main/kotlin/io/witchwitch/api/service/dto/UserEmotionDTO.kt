package io.witchwitch.api.service.dto

import io.witchwitch.api.domain.Emotion
import io.witchwitch.api.domain.UserEmotion
import java.io.Serializable
import java.time.Instant

data class UserEmotionDTO(
) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserEmotionDTO) return false
        return id != null && id == other.id
    }

    override fun hashCode() = 31
}
