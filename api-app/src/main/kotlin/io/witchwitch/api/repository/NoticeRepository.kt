package io.witchwitch.api.repository

import io.witchwitch.api.domain.Notice
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import reactor.core.publisher.Flux

interface NoticeRepository : ReactiveMongoRepository<Notice, String> {
}
