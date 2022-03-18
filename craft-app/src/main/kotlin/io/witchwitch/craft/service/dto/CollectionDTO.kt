package io.witchwitch.craft.service.dto

import com.fasterxml.jackson.annotation.JsonProperty
import io.witchwitch.core.domain.LanguageKey
import io.witchwitch.craft.web.rest.vm.CollectionVM
import java.io.Serializable
import java.time.Instant

data class CollectionDTO(

) : Serializable {

    fun copyVM(): CollectionDTO {
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CollectionDTO) return false
        return id != null && id == other.id
    }

    override fun hashCode() = 31
}
