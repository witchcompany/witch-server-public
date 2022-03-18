package io.witchwitch.api.web.rest

import io.witchwitch.api.service.dto.UserLocationDTO
import io.witchwitch.api.web.rest.vm.LocationPermissionVM
import io.witchwitch.api.web.rest.vm.LocationVM
import io.witchwitch.core.web.rest.constants.CustomHeaders
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import javax.validation.Valid

@RestController
@RequestMapping("/api/locations")
class LocationResource(
) {

    @PostMapping
    fun updateMyLocation(
        @Valid @RequestBody location: LocationVM,
        @RequestHeader(CustomHeaders.DEVICE_ID) deviceId: String
    ): Flux<UserLocationDTO> {
    }

    @GetMapping("/setting")
    fun getSetting(@RequestHeader(CustomHeaders.DEVICE_ID) deviceId: String): Mono<UserLocationDTO> {
    }

    @PutMapping("/setting")
    fun updateSetting(
        @RequestBody locationPermission: LocationPermissionVM,
        @RequestHeader(CustomHeaders.DEVICE_ID) deviceId: String
    ): Mono<UserLocationDTO> {
    }
}
