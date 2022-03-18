package io.witchwitch.api.service.dto

import java.io.Serializable
import java.time.Instant

data class TagDTO(


) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TagDTO) return false
        return id != null && id == other.id
    }

    override fun hashCode() = 31
}
