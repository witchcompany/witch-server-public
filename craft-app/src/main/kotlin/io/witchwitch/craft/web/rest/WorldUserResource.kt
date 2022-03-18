package io.witchwitch.craft.web.rest

import io.witchwitch.craft.domain.WorldUser
import io.witchwitch.craft.web.rest.vm.WorldUserVM
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api")
class WorldUserResource(
) {

    @GetMapping("/world-user")
    fun getWorldUser(): Mono<WorldUser> {
    }

    @PostMapping("/world-user")
    fun saveUser(@RequestBody worldUserVM: WorldUserVM): Mono<WorldUser> {
    }
}
