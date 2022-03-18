package io.witchwitch.auction.repository

import io.witchwitch.auction.domain.Event
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface EventRepository : ReactiveMongoRepository<Event, String> {
}
