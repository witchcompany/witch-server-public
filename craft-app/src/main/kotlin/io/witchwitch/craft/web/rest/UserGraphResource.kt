package io.witchwitch.craft.web.rest

import io.witchwitch.core.security.ADMIN
import io.witchwitch.craft.domain.KeyType
import io.witchwitch.craft.service.dto.FollowingDTO
import io.witchwitch.craft.web.rest.vm.FollowVM
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import javax.validation.Valid

@RestController
@RequestMapping("/api/users")
class UserGraphResource(
) {

    @PostMapping("/following")
    @Transactional
    fun follow(@Valid @RequestBody followVM: FollowVM): Mono<FollowingDTO> {
    }

    @PreAuthorize("hasRole('$ADMIN')")
    @DeleteMapping("/following")
    fun unfollow(@Valid @RequestBody followVM: FollowVM): Mono<Void> {
    }

    @GetMapping("/following/check")
    fun followingCheck(
        @RequestParam("peer_id") peerId: String,
        @RequestParam("key_type") keyType: KeyType
    ): Mono<Map<String, Boolean>> {
    }
}
