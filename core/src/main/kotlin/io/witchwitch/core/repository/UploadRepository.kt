package io.witchwitch.core.repository

import io.witchwitch.core.domain.Upload
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
interface UploadRepository : ReactiveMongoRepository<Upload, String> {
}
