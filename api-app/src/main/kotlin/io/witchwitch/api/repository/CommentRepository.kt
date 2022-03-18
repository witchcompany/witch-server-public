package io.witchwitch.api.repository

import io.witchwitch.api.domain.Comment
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CommentRepository :
    ReactiveMongoRepository<Comment, String>,
    CommentRepositoryInternal {
}

interface CommentRepositoryInternal {
}

class CommentRepositoryInternalImpl(
    private val reactiveMongoTemplate: ReactiveMongoTemplate
) : CommentRepositoryInternal {
}
