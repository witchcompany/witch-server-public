package io.witchwitch.craft.repository

import io.witchwitch.craft.domain.Followers
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface FollowersRepository :
    ReactiveMongoRepository<Followers, String>,
    FollowersRepositoryInternal {
}

interface FollowersRepositoryInternal {
}

class FollowersRepositoryInternalImpl(
    private val reactiveMongoTemplate: ReactiveMongoTemplate
) : FollowersRepositoryInternal {
}
