package io.witchwitch.craft.repository

import com.mongodb.client.result.UpdateResult
import io.witchwitch.craft.domain.Collection
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
interface CollectionRepository : ReactiveMongoRepository<Collection, String>, CustomizedCollectionRepository {
}

interface CustomizedCollectionRepository {
}

class CustomizedCollectionRepositoryImpl(private val reactiveMongoTemplate: ReactiveMongoTemplate) :
    CustomizedCollectionRepository {
}
