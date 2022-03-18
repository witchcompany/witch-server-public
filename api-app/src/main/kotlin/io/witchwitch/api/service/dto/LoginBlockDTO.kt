package io.witchwitch.api.service.dto

import java.io.Serializable
import java.time.Instant

data class LoginBlockDTO(


) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LoginBlockDTO) return false

        return id != null && other.id != null && id == other.id
    }

    override fun hashCode() = 31

    companion object {
        private const val serialVersionUID = 1L
    }
}
