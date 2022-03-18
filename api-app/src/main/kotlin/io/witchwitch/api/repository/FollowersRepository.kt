package io.witchwitch.api.repository

import io.witchwitch.api.domain.Followers
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
