package io.witchwitch.api.web.rest

import io.swagger.v3.oas.annotations.Parameter
import io.witchwitch.api.service.dto.ChatDTO
import io.witchwitch.api.service.dto.ChatLogDTO
import io.witchwitch.api.web.rest.vm.CreateChatVM
import io.witchwitch.api.web.rest.vm.WriteVM
import org.slf4j.LoggerFactory
import org.springdoc.core.converters.models.PageableAsQueryParam
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import javax.validation.Valid

@RestController
@RequestMapping("/api/chats")
class ChatResource(
) {
    private val log = LoggerFactory.getLogger(javaClass)

    @PostMapping
    fun create(@Valid @RequestBody createChatVM: CreateChatVM): Mono<ChatDTO> {
    }

    @PostMapping("/{chatId}/write")
    fun write(
        @PathVariable chatId: String,
        @Valid @RequestBody writeVM: WriteVM,
    ): Mono<ChatLogDTO> {
    }

    @PageableAsQueryParam
    @GetMapping
    fun chats(@Parameter(hidden = true) pageable: Pageable): Flux<ChatDTO> {
    }

    @GetMapping("/{chatId}/logs")
    fun chatLogs(
        @PathVariable chatId: String,
        @RequestParam("chat_log_id", required = false) chatLogId: String?,
        @RequestParam("fetch_count", required = true) fetchCount: Int
    ): Flux<ChatLogDTO> {
    }

    @PostMapping("/{chatId}/in")
    fun chatIn(@PathVariable chatId: String): Mono<ChatDTO> {
    }

    @PostMapping("/{chatId}/out")
    fun chatOut(@PathVariable chatId: String): Mono<ChatDTO> {
    }

    @PostMapping("/{chatId}/leave")
    fun leave(@PathVariable chatId: String): Mono<Void> {
    }

    private fun setProfile(chatDTO: ChatDTO): Flux<ChatDTO> {
    }
}
