package io.witchwitch.craft.web.rest

import io.witchwitch.craft.service.dto.ProfileDTO
import io.witchwitch.craft.web.rest.vm.ProfileVM
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import javax.validation.Valid

@RestController
@RequestMapping("/api/profile")
class ProfileResource(
) {

    @GetMapping
    fun getProfile(): Mono<ByteArray> {
    }

    @PutMapping
    fun setProfile(@Valid @RequestBody profileVM: ProfileVM): Mono<ProfileDTO> {
    }

    @GetMapping("/check/{nickname}")
    fun nicknameCheck(@PathVariable nickname: String): Mono<Map<String, Boolean>> {
    }
}
