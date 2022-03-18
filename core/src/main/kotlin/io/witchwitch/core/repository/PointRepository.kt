package io.witchwitch.core.repository

import io.witchwitch.core.domain.point.Point
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PointRepository : ReactiveMongoRepository<Point, String> {
}
