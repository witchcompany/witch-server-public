package io.witchwitch.craft.service.dto

import java.io.Serializable

data class UserCollectionDTO(

) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserCollectionDTO) return false
        return id != null && id == other.id
    }

    override fun hashCode() = 31
}
