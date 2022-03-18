package io.witchwitch.api.web.rest

import io.witchwitch.core.service.dto.InquiryDTO
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api")
class InquiryResource(
) {

    @PostMapping("/customer/contact")
    fun createInquiry(@RequestBody inquiryDTO: InquiryDTO): Mono<InquiryDTO> {
    }
}
