package io.witchwitch.api.web.rest

import io.witchwitch.api.service.dto.ProfileDTO
import io.witchwitch.api.web.rest.vm.FollowVM
import org.slf4j.LoggerFactory
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import javax.validation.Valid

@RestController
@RequestMapping("/api/users")
class UserGraphResource(
) {
    private val log = LoggerFactory.getLogger(javaClass)

    @PostMapping("/following")
    fun follow(@Valid @RequestBody followVM: FollowVM): Mono<Void> {
    }

    @DeleteMapping("/following")
    fun unfollow(@Valid @RequestBody followVM: FollowVM): Mono<Void> {
    }

    @GetMapping("/{userId}/following")
    fun getAllFollowing(@PathVariable userId: String, pageable: Pageable): Flux<ProfileDTO> {
    }

    @GetMapping("/{userId}/followers")
    fun getAllFollowers(@PathVariable userId: String, pageable: Pageable): Flux<ProfileDTO> {
    }

    @GetMapping("/following/check/{userId}")
    fun getMyFollowing(@Valid @PathVariable userId: String): Mono<Map<String, Boolean>> {
    }
}
