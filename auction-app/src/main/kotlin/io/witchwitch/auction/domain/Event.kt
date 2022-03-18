package io.witchwitch.auction.domain

import org.springframework.data.mongodb.core.mapping.Document

@Document("event")
data class Event(
) {
    enum class Type {
    }
}
