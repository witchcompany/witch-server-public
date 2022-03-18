package io.witchwitch.core.service

import io.witchwitch.core.service.dto.InquiryDTO
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class InquiryService(
) {

    fun findAll(): Flux<InquiryDTO> {
    }

    fun findById(): Mono<InquiryDTO> {
    }

    fun createInquiry(: Mono<InquiryDTO> {
    }

    fun checkMarking(): Mono<InquiryDTO> {
    }
}
