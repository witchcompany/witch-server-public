package io.witchwitch.auction.repository.auction

import io.witchwitch.auction.domain.auction.Auction
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface AuctionRepository : ReactiveMongoRepository<Auction, String>, AuctionRepositoryInternal {
}

interface AuctionRepositoryInternal {
}

class AuctionRepositoryInternalImpl(
    private val reactiveMongoTemplate: ReactiveMongoTemplate
) : AuctionRepositoryInternal {
}
