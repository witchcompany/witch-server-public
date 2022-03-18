package io.witchwitch.api.repository

import io.witchwitch.api.domain.LoginBlock
import org.springframework.data.mongodb.core.FindAndModifyOptions
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.core.findAndModify
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query
import org.springframework.data.mongodb.core.query.Update
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono
import java.time.Instant

@Repository
interface LoginBlockRepository : ReactiveMongoRepository<LoginBlock, String>, CustomizedLoginBlockRepository {
}

interface CustomizedLoginBlockRepository {
}

class CustomizedLoginBlockRepositoryImpl(private val reactiveMongoTemplate: ReactiveMongoTemplate) :
    CustomizedLoginBlockRepository {
}
