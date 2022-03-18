package io.witchwitch.api.service.dto

import io.witchwitch.api.domain.PermissionType
import java.io.Serializable
import java.time.Instant
import javax.validation.constraints.Size

data class ProfileDTO(


) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProfileDTO) return false
        return id != null && id == other.id
    }

    override fun hashCode() = 31
}
