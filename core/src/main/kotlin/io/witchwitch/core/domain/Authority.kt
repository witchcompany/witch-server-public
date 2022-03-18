package io.witchwitch.core.domain

import java.io.Serializable

/**
 * An authority (a security role) used by Spring Security.
 */
data class Authority(


) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Authority) return false
        if (other.name == null || name == null) return false

        return name == other.name
    }

    override fun hashCode() = 31

    companion object {
        private const val serialVersionUID = 1L
    }
}
