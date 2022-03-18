package io.witchwitch.auction.repository.auction

import io.witchwitch.auction.domain.auction.UserAuction
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserAuctionRepository : ReactiveMongoRepository<UserAuction, String>, CustomizedUserAuctionRepository {
}

interface CustomizedUserAuctionRepository {
}

class CustomizedUserAuctionRepositoryImpl(
    private val reactiveMongoTemplate: ReactiveMongoTemplate
) : CustomizedUserAuctionRepository {
}
