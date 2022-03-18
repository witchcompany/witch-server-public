package io.witchwitch.core.repository

import io.witchwitch.core.domain.BidHistory
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface BidHistoryRepository : ReactiveMongoRepository<BidHistory, String> {
}
