package io.witchwitch.api.repository

import io.witchwitch.api.domain.UserEmotion
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface UserEmotionRepository :
    ReactiveMongoRepository<UserEmotion, String>,
    UserEmotionRepositoryInternal {
}

interface UserEmotionRepositoryInternal {
}

class UserEmotionRepositoryInternalImpl(
    private val reactiveMongoTemplate: ReactiveMongoTemplate
) : UserEmotionRepositoryInternal {
}
