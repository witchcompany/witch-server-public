package io.witchwitch.api.service.dto

import com.fasterxml.jackson.annotation.JsonIgnore
import java.io.Serializable
import java.time.Instant

data class DeviceDTO(


) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceDTO) return false
        return id != null && id == other.id
    }

    override fun hashCode() = 31
}
