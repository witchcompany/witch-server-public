package io.witchwitch.craft.repository

import io.witchwitch.craft.domain.Banner
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import java.time.Instant

@Repository
interface BannerRepository : ReactiveMongoRepository<Banner, String> {
}
