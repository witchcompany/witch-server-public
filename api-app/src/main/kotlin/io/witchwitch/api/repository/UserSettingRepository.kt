package io.witchwitch.api.repository

import io.witchwitch.api.domain.UserSetting
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserSettingRepository : ReactiveMongoRepository<UserSetting, String>, CustomizedUserSettingRepository {
}

interface CustomizedUserSettingRepository {
}

class CustomizedUserSettingRepositoryImpl(
    private val reactiveMongoTemplate: ReactiveMongoTemplate
) : CustomizedUserSettingRepository {
}
