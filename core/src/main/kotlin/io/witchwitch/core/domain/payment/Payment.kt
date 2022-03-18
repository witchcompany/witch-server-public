package io.witchwitch.core.domain.payment

import java.io.Serializable

data class Payment(

) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Payment) return false

        return id != null && other.id != null && id == other.id
    }

    override fun hashCode() = 31

    companion object {
        private const val serialVersionUID = 1L
    }
}

enum class PaymentStatus {
}
