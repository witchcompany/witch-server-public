package io.witchwitch.api.web.rest

import io.witchwitch.api.service.dto.DeviceDTO
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import javax.validation.Valid

@RestController
@RequestMapping("/api/devices")
class DeviceResource(
) {

    private val log = LoggerFactory.getLogger(javaClass)

    @PostMapping
    fun createDevice(@Valid @RequestBody deviceDTO: DeviceDTO): Mono<DeviceDTO> {
    }

    @PutMapping
    fun updateDevice(@Valid @RequestBody deviceDTO: DeviceDTO): Mono<DeviceDTO> {
    }

    @DeleteMapping("/{id}")
    fun deleteDevice(@PathVariable id: String): Mono<Void> {
    }
}
