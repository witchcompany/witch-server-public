package io.witchwitch.craft.service

import io.witchwitch.craft.repository.BannerRepository
import io.witchwitch.craft.service.dto.BannerDTO
import io.witchwitch.craft.service.mapper.BannerMapper
import io.witchwitch.craft.web.rest.vm.BannerVM
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.time.ZonedDateTime

@Service
class BannerService(
) {

    fun findAllBy(): Flux<BannerDTO> {
    }

    fun findAllByExpiredAt(): Flux<BannerDTO> {
    }

    fun findById(): Mono<BannerDTO> {
    }

    fun createBanner(): Mono<BannerDTO> {
    }

    fun updateBanner(): Mono<BannerDTO> {
    }

    fun flipVisible(): Mono<Void> {
    }
}
