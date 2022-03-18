package io.witchwitch.api.service.dto

import java.io.Serializable
import java.time.Instant
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class NoticeDTO(


) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NoticeDTO) return false
        return id != null && id == other.id
    }

    override fun hashCode() = 31
}
