package io.witchwitch.api.repository.chat

import io.witchwitch.api.domain.chat.Chat
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ChatRepository :
    ReactiveMongoRepository<Chat, String>,
    ChatRepositoryInternal {
}

interface ChatRepositoryInternal {
}

class ChatRepositoryInternalImpl(
    private val reactiveMongoTemplate: ReactiveMongoTemplate
) : ChatRepositoryInternal {
}
