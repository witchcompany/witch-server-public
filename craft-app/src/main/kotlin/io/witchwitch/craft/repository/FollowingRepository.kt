package io.witchwitch.craft.repository

import io.witchwitch.craft.domain.Following
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface FollowingRepository : ReactiveMongoRepository<Following, String>, FollowingRepositoryInternal {
}

interface FollowingRepositoryInternal {
}

class FollowingRepositoryInternalImpl(
    private val reactiveMongoTemplate: ReactiveMongoTemplate
) : FollowingRepositoryInternal {
}
