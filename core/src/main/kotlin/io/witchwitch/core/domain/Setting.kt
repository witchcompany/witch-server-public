package io.witchwitch.core.domain

import org.springframework.data.mongodb.core.mapping.Document
import java.io.Serializable

@Document(collection = "setting")
data class Setting<T>(
) : Serializable {

    companion object {
        private const val serialVersionUID = 1L
    }
}
