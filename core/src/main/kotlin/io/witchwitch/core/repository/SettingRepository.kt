package io.witchwitch.core.repository

import com.fasterxml.jackson.databind.ObjectMapper
import io.witchwitch.core.domain.Setting
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface SettingRepository : ReactiveMongoRepository<Setting<Any>, String>, CustomizedSettingRepository

interface CustomizedSettingRepository {
}

class CustomizedSettingRepositoryImpl(
    private val reactiveMongoTemplate: ReactiveMongoTemplate,
    private val objectMapper: ObjectMapper
) : CustomizedSettingRepository {

}
