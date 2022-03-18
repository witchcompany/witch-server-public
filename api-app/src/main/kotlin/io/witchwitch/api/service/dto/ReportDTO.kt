package io.witchwitch.api.service.dto

import io.witchwitch.api.domain.ReportTargetType
import java.io.Serializable
import java.time.Instant

data class ReportDTO(


) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ReportDTO) return false
        return id != null && id == other.id
    }

    override fun hashCode() = 31
}
