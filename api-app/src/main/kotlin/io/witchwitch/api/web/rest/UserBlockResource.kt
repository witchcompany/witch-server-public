package io.witchwitch.api.web.rest

import io.witchwitch.api.service.dto.UserBlockDTO
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api")
class UserBlockResource(

) {

    @PostMapping("/users/{peer_id}/block")
    fun userBlock(@PathVariable("peer_id") peerId: String): Mono<UserBlockDTO> {
    }
}
