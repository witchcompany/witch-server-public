package io.witchwitch.api.service.dto

import java.io.Serializable
import java.math.BigDecimal
import java.time.Instant

data class WalletDTO(


) : Serializable {

    fun increaseQuantity(): WalletDTO {
    }

    fun decreaseQuantity(): WalletDTO {
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WalletDTO) return false
        return id != null && id == other.id
    }

    override fun hashCode() = 31
}
