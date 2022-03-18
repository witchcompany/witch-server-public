package io.witchwitch.core.repository

import io.witchwitch.core.domain.payment.Payment
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PaymentRepository : ReactiveMongoRepository<Payment, String>, PaymentRepositoryInternal {
}

interface PaymentRepositoryInternal {
}

class PaymentRepositoryInternalImpl(
    private val reactiveMongoTemplate: ReactiveMongoTemplate
) : PaymentRepositoryInternal {
}
