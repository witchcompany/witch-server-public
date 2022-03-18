package io.witchwitch.api.repository

import io.witchwitch.api.domain.Profile
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ProfileRepository : ReactiveMongoRepository<Profile, String>, CustomizedProfileRepository {
}

interface CustomizedProfileRepository {
}

class CustomizedProfileRepositoryImpl(private val reactiveMongoTemplate: ReactiveMongoTemplate) :
    CustomizedProfileRepository {
}
