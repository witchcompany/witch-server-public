package io.witchwitch.api.web.rest

import io.witchwitch.api.domain.Emotion
import io.witchwitch.api.domain.post.MapType
import io.witchwitch.api.service.dto.PostDTO
import io.witchwitch.api.service.dto.ProfileDTO
import io.witchwitch.api.service.dto.UserEmotionDTO
import io.witchwitch.api.service.dto.UserSettingDTO
import io.witchwitch.core.web.rest.constants.CustomHeaders
import org.slf4j.LoggerFactory
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpStatus
import org.springframework.http.server.reactive.ServerHttpResponse
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class PostResource(
) {
    private val log = LoggerFactory.getLogger(javaClass)

    @GetMapping("/posts/mine")
    fun getAllMyPosts(
        pageable: Pageable,
        response: ServerHttpResponse
    ): Flux<PostDTO> {
    }

    @GetMapping("/posts")
    fun getAllPostByPostTarget(
        @RequestParam("post_id", required = false) postId: String?,
        @RequestParam("fetch_count") fetchCount: Int,
        @RequestParam("map_type") mapType: MapType,
        @RequestParam longitude: Double,
        @RequestParam latitude: Double
    ): Flux<PostDTO> {
    }

    @GetMapping("/posts/{post_id}")
    fun getPost(@PathVariable("post_id") postId: String): Mono<PostDTO> {
    }

    @GetMapping("/posts/user/{user_id}")
    fun getAllPostByUser(
        @PathVariable("user_id") userId: String,
        pageable: Pageable
    ): Flux<PostDTO> {
    }

    @PostMapping("/posts")
    @ResponseStatus(HttpStatus.CREATED)
    fun createPost(
        @Valid @RequestBody postDTO: PostDTO,
        @RequestHeader(CustomHeaders.DEVICE_ID) deviceId: String
    ): Mono<PostDTO> {
        }

    }

    @PutMapping("/posts")
    fun updatePost(@Valid @RequestBody postDTO: PostDTO): Mono<PostDTO> {
    }

    @DeleteMapping("/posts/{id}")
    fun deletePost(@PathVariable id: String): Mono<Void> {
    }

    @GetMapping("/posts/{id}/emotion")
    fun getEmotion(@PathVariable id: String): Flux<UserEmotionDTO> {
    }

    @PostMapping("/posts/{id}/emotion/{emotion}")
    fun createEmotion(@PathVariable id: String, @PathVariable emotion: Emotion): Mono<PostDTO> {
    }

    @DeleteMapping("/posts/{id}/emotion/{emotion}")
    fun deleteEmotion(@PathVariable id: String, @PathVariable emotion: Emotion): Mono<PostDTO> {
    }

    @GetMapping("/posts/_search/{query}")
    fun searchByTag(
        pageable: Pageable,
        response: ServerHttpResponse,
        @PathVariable query: String
    ): Flux<PostDTO> {
    }

    private fun emotionPushSend(
        userId: String,
        userSettingDTO: UserSettingDTO,
        postDTO: PostDTO,
        profileDTO: ProfileDTO,
        emotion: Emotion
    ): Mono<Void> {
    }
}
