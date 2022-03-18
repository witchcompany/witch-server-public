package io.witchwitch.core.repository

import io.witchwitch.core.domain.point.PointDetail
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PointDetailRepository : ReactiveMongoRepository<PointDetail, String> {
}
