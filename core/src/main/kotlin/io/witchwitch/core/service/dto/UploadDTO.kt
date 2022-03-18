package io.witchwitch.core.service.dto

import com.fasterxml.jackson.annotation.JsonIgnore
import java.io.Serializable
import java.time.Instant

data class UploadDTO(


) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UploadDTO) return false
        return id != null && id == other.id
    }

    override fun hashCode() = 31
}
