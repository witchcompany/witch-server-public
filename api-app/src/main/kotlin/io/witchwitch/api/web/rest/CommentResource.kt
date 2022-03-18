package io.witchwitch.api.web.rest

import io.witchwitch.api.service.dto.CommentDTO
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
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
class CommentResource(
) {
    private val log = LoggerFactory.getLogger(javaClass)

    @GetMapping("/posts/{postId}/comments")
    fun getAllCommentsByPostId(
        @PathVariable postId: String,
        @RequestParam(required = false) parentId: String?,
        @RequestParam("comment_id", required = false) commentId: String?,
        @RequestParam("fetch_count") fetchCount: Int
    ): Flux<CommentDTO> {
    }

    @PostMapping("/posts/{postId}/comments")
    @ResponseStatus(HttpStatus.CREATED)
    fun createComment(@Valid @RequestBody commentDTO: CommentDTO): Mono<CommentDTO> {
    }

    @PutMapping("/posts/{postId}/comments")
    fun updateComment(@Valid @RequestBody commentDTO: CommentDTO): Mono<CommentDTO> {
    }

    @DeleteMapping("/posts/{postId}/comments/{commentId}")
    fun deleteComment(@PathVariable commentId: String, @PathVariable postId: String): Mono<Void> {
    }
}
