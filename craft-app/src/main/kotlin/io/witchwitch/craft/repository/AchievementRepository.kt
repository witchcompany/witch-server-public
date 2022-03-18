package io.witchwitch.craft.repository

import io.witchwitch.craft.domain.achievement.Achievement
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface AchievementRepository : ReactiveMongoRepository<Achievement, String> {
}
