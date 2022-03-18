package io.witchwitch.core.repository

import io.witchwitch.core.domain.Bid
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface BidRepository : ReactiveMongoRepository<Bid, String>, BidRepositoryInternal {
}

interface BidRepositoryInternal {
}

class BidRepositoryInternalImpl(
    private val reactiveMongoTemplate: ReactiveMongoTemplate
) : BidRepositoryInternal {
}
