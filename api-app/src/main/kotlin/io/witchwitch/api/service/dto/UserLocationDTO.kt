package io.witchwitch.api.service.dto

import com.fasterxml.jackson.annotation.JsonIgnore
import io.witchwitch.api.domain.PermissionType
import org.springframework.data.mongodb.core.geo.GeoJsonPoint
import java.io.Serializable
import java.time.Instant

data class UserLocationDTO(


) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserLocationDTO) return false
        return id != null && id == other.id
    }

    override fun hashCode() = 31
}
