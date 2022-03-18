package io.witchwitch.core.domain

import java.io.Serializable

data class Inquiry(

) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Inquiry) return false

        return id != null && other.id != null && id == other.id
    }

    override fun hashCode() = 31

    companion object {
        private const val serialVersionUID = 1L
    }
}

enum class InquiryType {
    WITCH_WITCH,
    WITCH_CRAFT,
    WITCH_AUCTION,
    WITCH_TOKEN,
    OTHER
}
