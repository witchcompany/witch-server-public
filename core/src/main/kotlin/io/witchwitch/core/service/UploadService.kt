package io.witchwitch.core.service

import io.witchwitch.core.domain.Upload
import io.witchwitch.core.service.dto.UploadDTO
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import software.amazon.awssdk.services.s3.model.DeleteObjectsResponse

@Service
class UploadService(
) {
    private val log = LoggerFactory.getLogger(javaClass)

    fun upload(): Mono<UploadDTO> {
    }

    private fun uploadToS3(): Mono<Upload> {
    }

    private fun deleteFromS3(): Mono<DeleteObjectsResponse> {
    }

    private fun getKey(): String {
    }
}
