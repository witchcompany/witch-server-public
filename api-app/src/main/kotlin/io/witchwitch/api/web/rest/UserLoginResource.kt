package io.witchwitch.api.web.rest

import io.witchwitch.api.service.dto.LoginBlockDTO
import io.witchwitch.api.service.dto.LoginBlockLogDTO
import io.witchwitch.api.web.rest.vm.LoginBlockVM
import io.witchwitch.core.security.ADMIN
import org.springframework.security.access.prepost.PreAuthorize
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
@RequestMapping("/api")
@PreAuthorize("hasRole('$ADMIN')")
class UserLoginResource(
) {

    @GetMapping("/users/{user_id}/block")
    fun getAllLoginBlock(@PathVariable("user_id") userId: String): Mono<LoginBlockDTO> {
    }

    @PostMapping("/users/block")
    fun loginBlock(@Valid @RequestBody loginBlockVM: LoginBlockVM): Mono<LoginBlockDTO> {
    }

    @DeleteMapping("/users/unblock")
    fun loginUnBlock(@Valid @RequestBody loginBlockVM: LoginBlockVM): Mono<Void> {
    }

    @GetMapping("/users/{user_id}/block/logs")
    fun getAllLoginBlockLog(@PathVariable("user_id") userId: String): Flux<LoginBlockLogDTO> {
    }
}
