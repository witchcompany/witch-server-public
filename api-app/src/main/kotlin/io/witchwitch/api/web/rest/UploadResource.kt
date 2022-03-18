package io.witchwitch.api.web.rest

import io.witchwitch.core.service.dto.UploadDTO
import org.springframework.http.codec.multipart.FilePart
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestPart
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api/uploads")
class UploadResource(
) {
    @PostMapping
    fun create(@RequestPart("upload") filePart: Mono<FilePart>): Mono<UploadDTO> {
    }
}
