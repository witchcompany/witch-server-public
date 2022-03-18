package io.witchwitch.core.service.dto

import java.io.Serializable

data class BidDTO(

) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BidDTO) return false
        return id != null && id == other.id
    }

    override fun hashCode() = 31

    fun bidderValid(): Boolean {
    }

    fun bidPriceValid(): Boolean {
    }

    fun minimumBidPriceValid(): Boolean {
    }
}
