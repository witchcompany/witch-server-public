package io.witchwitch.api.service

import io.witchwitch.api.service.dto.TagDTO
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class TagService(
) {

    fun findAllByContent(): Flux<TagDTO> {
    }
}
