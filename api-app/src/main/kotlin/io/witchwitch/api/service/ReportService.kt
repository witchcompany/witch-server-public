package io.witchwitch.api.service

import io.witchwitch.api.domain.ReportTargetType
import io.witchwitch.api.service.dto.ReportDTO
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class ReportService(
) {
    init {
    }

    companion object {
    }

    fun countByUserId(): Mono<Long> {
    }

    fun countByReportTargetId(): Mono<Long> {
    }

    fun find(): Flux<ReportDTO> {
    }

    fun createReport(): Mono<ReportDTO> {
    }

    fun delete(): Mono<Void> {
    }
}
