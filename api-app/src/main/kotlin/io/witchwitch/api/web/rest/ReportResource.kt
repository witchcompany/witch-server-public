package io.witchwitch.api.web.rest

import io.witchwitch.api.domain.ReportTargetType
import io.witchwitch.api.service.CommentService
import io.witchwitch.api.service.LoginBlockService
import io.witchwitch.api.service.PostService
import io.witchwitch.api.service.PushNotificationService
import io.witchwitch.api.service.ReportService
import io.witchwitch.api.service.dto.ReportDTO
import org.slf4j.LoggerFactory
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpStatus
import org.springframework.http.server.reactive.ServerHttpResponse
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class ReportResource(
    private val reportService: ReportService,
    private val postService: PostService,
    private val pushNotificationService: PushNotificationService,
    private val loginBlockService: LoginBlockService,
    private val commentService: CommentService
) {
    private val log = LoggerFactory.getLogger(javaClass)

    @GetMapping("/reports")
    fun getReports(
        @RequestParam("report_target_type") reportTargetType: ReportTargetType,
        pageable: Pageable,
        response: ServerHttpResponse
    ): Flux<ReportDTO> {
    }

    @PostMapping("/reports")
    @ResponseStatus(HttpStatus.CREATED)
    fun createReport(@Valid @RequestBody reportDTO: ReportDTO): Mono<ReportDTO> {
    }

    @DeleteMapping("/reports/{id}")
    fun deleteReport(@PathVariable id: String): Mono<Void> {
    }
}
