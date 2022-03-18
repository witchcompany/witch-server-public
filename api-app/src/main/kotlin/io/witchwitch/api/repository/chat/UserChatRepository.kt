package io.witchwitch.api.repository.chat

import io.witchwitch.api.domain.chat.UserChat
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserChatRepository : ReactiveMongoRepository<UserChat, String> {
}
