package io.witchwitch.api.web.rest

import io.witchwitch.api.service.dto.ProfileDTO
import io.witchwitch.api.service.dto.PushLogDTO
import io.witchwitch.api.service.dto.UserSettingDTO
import io.witchwitch.api.service.dto.WalletDTO
import io.witchwitch.api.web.rest.vm.LocationVM
import io.witchwitch.api.web.rest.vm.UpdateUserVM
import io.witchwitch.api.web.rest.vm.UserSettingVM
import io.witchwitch.core.service.dto.UserDTO
import io.witchwitch.core.web.rest.constants.CustomHeaders
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.util.function.Tuple2
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class UserResource(
) {
    @PutMapping("/users")
    fun updateUser(
        @Valid @RequestBody updateUserVM: UpdateUserVM,
    ): Mono<Tuple2<UserDTO, ProfileDTO>> {
    }

    @GetMapping("/users/setting")
    fun getSetting(): Mono<UserSettingDTO> {
    }

    @PutMapping("/users/setting")
    fun updateSetting(@RequestBody userSettingVM: UserSettingVM): Mono<UserSettingDTO> {
    }

    @GetMapping("/users/notification")
    fun getNotification(
        pageable: Pageable,
        @RequestHeader(CustomHeaders.DEVICE_ID) deviceId: String
    ): Flux<PushLogDTO> {
    }

    @PostMapping("/users/login")
    fun logIn(
        @Valid @RequestBody location: LocationVM,
        @RequestHeader(CustomHeaders.DEVICE_ID) deviceId: String
    ): Mono<WalletDTO> {
    }
}
