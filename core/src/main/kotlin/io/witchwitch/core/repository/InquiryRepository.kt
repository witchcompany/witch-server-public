package io.witchwitch.core.repository

import io.witchwitch.core.domain.Inquiry
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface InquiryRepository : ReactiveMongoRepository<Inquiry, String>, InquiryRepositoryInternal {
}

interface InquiryRepositoryInternal {
}

class InquiryRepositoryInternalImpl(
    private val reactiveMongoTemplate: ReactiveMongoTemplate
) : InquiryRepositoryInternal {
}
