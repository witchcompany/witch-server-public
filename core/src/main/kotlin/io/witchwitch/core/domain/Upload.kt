package io.witchwitch.core.domain

import java.io.Serializable

data class Upload(

) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Upload) return false

        return id != null && other.id != null && id == other.id
    }

    override fun hashCode() = 31

    override fun toString(): String {
    }

    companion object {
        private const val serialVersionUID = 1L
    }
}
