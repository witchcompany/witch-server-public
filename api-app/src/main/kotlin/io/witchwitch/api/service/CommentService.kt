package io.witchwitch.api.service

import io.witchwitch.api.domain.post.Post
import io.witchwitch.api.service.dto.CommentDTO
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class CommentService(
) {
    companion object {
    }

    fun countByPostIdAndParentId(): Mono<Long> {
    }

    fun countByPostId(): Mono<Long> {
    }

    fun findOneById(): Mono<CommentDTO> {
    }

    fun findAllByPostIdAndParentId(
    ): Flux<CommentDTO> {
    }

    fun findAllByPostId(
    ): Flux<CommentDTO> {
    }

    @Transactional
    fun createComment(): Mono<CommentDTO> {
    }

    fun updateComment(): Mono<CommentDTO> {
    }

    @Transactional
    fun deleteComment(): Mono<Void> {
    }

    private fun increasePostScore(): Mono<Post> {
    }
}
