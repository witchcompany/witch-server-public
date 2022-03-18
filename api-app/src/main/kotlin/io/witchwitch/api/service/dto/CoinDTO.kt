package io.witchwitch.api.service.dto

import io.witchwitch.api.domain.wallet.CoinType
import org.springframework.data.mongodb.core.geo.GeoJsonPoint
import java.io.Serializable
import java.math.BigDecimal
import java.time.Instant

data class CoinDTO(


) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CoinDTO) return false
        return id != null && id == other.id
    }

    override fun hashCode() = 31
}
