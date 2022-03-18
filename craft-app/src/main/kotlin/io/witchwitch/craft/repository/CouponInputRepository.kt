package io.witchwitch.craft.repository

import io.witchwitch.craft.domain.CouponInput
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

@Repository
interface CouponInputRepository : ReactiveMongoRepository<CouponInput, String> {
}
