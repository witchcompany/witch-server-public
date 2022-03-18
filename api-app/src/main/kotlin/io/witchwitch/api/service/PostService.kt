package io.witchwitch.api.service

import io.witchwitch.api.service.dto.PostDTO
import io.witchwitch.api.service.dto.UserEmotionDTO
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class PostService(
) {
    init {
    }

    companion object {
    }

    fun countByUserId(): Mono<Long> {
    }

    fun findAllByUserId(): Flux<PostDTO> {
    }

    fun findAllByPostTarget(
    ): Flux<PostDTO> {
    }

    fun findById(): Mono<PostDTO> {
    }

    @Transactional
    fun createPost(): Mono<PostDTO> {
    }

    fun updatePost(): Mono<PostDTO> {
    }

    fun deletePost(): Mono<Void> {
    }

    fun createEmotion(): Mono<PostDTO> {
    }

    fun deleteEmotion(): Mono<PostDTO> {
    }

    fun getEmotion(): Flux<UserEmotionDTO> {
    }

    fun findAllByTag(): Flux<PostDTO> {
    }

    fun countByTag(): Mono<Long> {
    }

    fun findAll(): Flux<PostDTO> {
    }
}
