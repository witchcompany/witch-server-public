package io.witchwitch.api.service.dto

import io.witchwitch.api.domain.wallet.WalletLogType
import io.witchwitch.api.domain.wallet.extra.WalletLogExtra
import io.witchwitch.core.domain.ServiceType
import java.io.Serializable
import java.math.BigDecimal
import java.time.Instant

data class WalletLogDTO(

) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WalletLogDTO) return false
        return id != null && id == other.id
    }

    override fun hashCode() = 31
}
