package io.witchwitch.api.repository.chat

import io.witchwitch.api.domain.chat.ChatLog
import org.bson.types.ObjectId
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

@Repository
interface ChatLogRepository : ReactiveMongoRepository<ChatLog, String> {
}
