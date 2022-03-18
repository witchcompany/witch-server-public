package io.witchwitch.craft.repository

import io.witchwitch.craft.domain.Coupon
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CouponRepository : ReactiveMongoRepository<Coupon, String> {
}
