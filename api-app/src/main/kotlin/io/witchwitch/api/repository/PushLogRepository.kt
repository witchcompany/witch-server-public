package io.witchwitch.api.repository

import io.witchwitch.api.domain.PushLog
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PushLogRepository : ReactiveMongoRepository<PushLog, String> {
}
