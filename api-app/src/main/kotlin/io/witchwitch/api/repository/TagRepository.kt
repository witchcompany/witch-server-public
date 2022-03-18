package io.witchwitch.api.repository

import io.witchwitch.api.domain.Tag
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface TagRepository :
    ReactiveMongoRepository<Tag, String>,
    TagRepositoryInternal {
}

interface TagRepositoryInternal {
}

class TagRepositoryInternalImpl(
    private val reactiveMongoTemplate: ReactiveMongoTemplate
) : TagRepositoryInternal {
}
