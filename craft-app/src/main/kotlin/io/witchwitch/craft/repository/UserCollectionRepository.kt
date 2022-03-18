package io.witchwitch.craft.repository

import io.witchwitch.craft.domain.UserCollection
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserCollectionRepository :
    ReactiveMongoRepository<UserCollection, String>,
    CustomizedUserCollectionRepository {
}

interface CustomizedUserCollectionRepository {
}

class CustomizedUserCollectionRepositoryImpl(private val reactiveMongoTemplate: ReactiveMongoTemplate) :
    CustomizedUserCollectionRepository {
}
