package io.witchwitch.core.service.dto

import com.fasterxml.jackson.annotation.JsonProperty
import io.witchwitch.core.domain.order.Amount
import io.witchwitch.core.domain.order.Item
import io.witchwitch.core.domain.payment.PayType
import io.witchwitch.core.domain.payment.extra.PaymentExtra
import java.io.Serializable
import java.time.Instant

data class PaymentDTO(


) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PaymentDTO) return false

        return id != null && other.id != null && id == other.id
    }

    override fun hashCode() = 31

    companion object {
        private const val serialVersionUID = 1L
    }
}
