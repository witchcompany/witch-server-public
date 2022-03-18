package io.witchwitch.api.repository

import io.witchwitch.api.domain.UserBlock
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

@Repository
interface UserBlockRepository : ReactiveMongoRepository<UserBlock, String> {
}
