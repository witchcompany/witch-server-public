package io.witchwitch.api.repository

import io.witchwitch.api.domain.post.Post
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PostRepository :
    ReactiveMongoRepository<Post, String>,
    PostRepositoryInternal {
}

interface PostRepositoryInternal {
}

class PostRepositoryInternalImpl(
    private val reactiveMongoTemplate: ReactiveMongoTemplate
) : PostRepositoryInternal {
}
