package io.witchwitch.api.repository

import io.witchwitch.api.domain.UserAccessLog
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserAccessLogRepository : ReactiveMongoRepository<UserAccessLog, String> {
}
