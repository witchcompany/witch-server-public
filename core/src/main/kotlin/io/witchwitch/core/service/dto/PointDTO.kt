package io.witchwitch.core.service.dto

import com.fasterxml.jackson.annotation.JsonProperty
import io.witchwitch.core.domain.ServiceType
import io.witchwitch.core.domain.point.PointStatus
import java.io.Serializable
import java.time.Instant

data class PointDTO(

) : Serializable {

    override fun equals(other: Any?): Boolean {
    }

    override fun hashCode() = 31

    fun isDecreaseBalanceValid(): Boolean {
    }

    fun pointUseValid(): Boolean {
    }
}
