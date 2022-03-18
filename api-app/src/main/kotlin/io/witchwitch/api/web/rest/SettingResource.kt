package io.witchwitch.api.web.rest

import io.witchwitch.core.domain.Setting
import io.witchwitch.core.domain.SettingKey
import io.witchwitch.core.repository.SettingRepository
import io.witchwitch.core.security.ADMIN
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api/settings")
class SettingResource(
    private val settingRepository: SettingRepository
) {

    @GetMapping
    fun getSetting(@RequestParam("key") key: SettingKey): Mono<Any> {
    }

    @PostMapping
    @PreAuthorize("hasAuthority('$ADMIN')")
    fun setSetting(@RequestBody setting: Setting<Any>): Mono<Void> {
    }
}
