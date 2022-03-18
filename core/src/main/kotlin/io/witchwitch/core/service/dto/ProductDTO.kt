package io.witchwitch.core.service.dto

import com.fasterxml.jackson.annotation.JsonProperty
import io.witchwitch.core.config.PRICE_REGEX
import io.witchwitch.core.domain.LanguageKey
import io.witchwitch.core.domain.product.ProductSalesType
import io.witchwitch.core.domain.product.ProductStatus
import io.witchwitch.core.domain.product.ProductType
import io.witchwitch.core.domain.product.TagKey
import io.witchwitch.core.domain.product.extra.ProductExtra
import io.witchwitch.core.web.rest.vm.ProductVM
import java.io.Serializable
import java.time.Instant
import javax.validation.constraints.Pattern

data class ProductDTO(

) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProductDTO) return false
        return id != null && id == other.id
    }

    override fun hashCode() = 31

    fun productCountOrderIsValid(): Boolean {
    }

    fun isLastOrder(): Boolean {
    }

    fun findNameByLanguage(): String {
    }

    fun salesTimeValid(): Boolean {
    }

    fun salesTypeNotEventValid(): Boolean {
    }

    fun copyVM(): ProductDTO {
    }
}
