package io.witchwitch.api.service.dto

import io.witchwitch.api.domain.Emotion
import io.witchwitch.api.domain.PermissionType
import io.witchwitch.core.service.dto.UploadDTO
import org.springframework.data.mongodb.core.geo.GeoJsonPoint
import java.io.Serializable
import java.time.Instant

data class PostDTO(


) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PostDTO) return false
        return id != null && id == other.id
    }

    override fun hashCode() = 31
}
