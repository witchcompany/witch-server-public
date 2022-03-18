package io.witchwitch.core.service.dto

import java.io.Serializable

data class InquiryDTO(
) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InquiryDTO) return false
        return id != null && id == other.id
    }

    override fun hashCode() = 31
}
