package io.witchwitch.craft.web.rest

import io.swagger.v3.oas.annotations.Parameter
import io.witchwitch.core.security.ADMIN
import io.witchwitch.core.service.dto.InquiryDTO
import org.springdoc.core.converters.models.PageableAsQueryParam
import org.springframework.data.domain.Pageable
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class InquiryResource(
) {

    @PostMapping("/customer/contact")
    fun createInquiry(@Valid @RequestBody inquiryDTO: InquiryDTO): Mono<InquiryDTO> {
    }

    @PageableAsQueryParam
    @PreAuthorize("hasRole('$ADMIN')")
    @GetMapping("/customer/contact")
    fun getInquiryList(@Parameter(hidden = true) pageable: Pageable): Flux<InquiryDTO> {
    }

    @PreAuthorize("hasRole('$ADMIN')")
    @GetMapping("/customer/contact/{id}")
    fun getInquiry(@PathVariable id: String): Mono<InquiryDTO> {
    }

    @PreAuthorize("hasRole('$ADMIN')")
    @PutMapping("/customer/contact/{id}")
    fun checkMarking(@PathVariable id: String): Mono<InquiryDTO> {
    }
}
