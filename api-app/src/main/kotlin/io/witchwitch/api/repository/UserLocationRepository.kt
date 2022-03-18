package io.witchwitch.api.repository

import io.witchwitch.api.domain.UserLocation
import org.springframework.data.geo.Distance
import org.springframework.data.geo.Point
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.time.Instant

@Repository
interface UserLocationRepository : ReactiveMongoRepository<UserLocation, String> {
}
