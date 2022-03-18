package io.witchwitch.craft.service

import com.mongodb.client.result.UpdateResult
import io.witchwitch.core.service.dto.BidDTO
import io.witchwitch.craft.service.dto.ProfileDTO
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class ProfileService(
) {


    fun setProfile(): Mono<ProfileDTO> {
    }

    fun findByUserId(): Mono<ProfileDTO> {
    }

    fun nicknameCheck(): Mono<Boolean> {
    }

    fun updateCollectionCountAndProductCount(
    ): Mono<UpdateResult> {
    }

    fun increaseExp(): Mono<UpdateResult> {
    }

    fun findNicknameAndImageByBid(): Mono<BidDTO> {
    }
}
