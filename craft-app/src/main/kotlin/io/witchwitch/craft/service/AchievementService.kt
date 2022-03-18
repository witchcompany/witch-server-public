package io.witchwitch.craft.service

import io.witchwitch.core.config.LocaleConfiguration
import io.witchwitch.core.domain.LanguageKey
import io.witchwitch.core.service.dto.ProductDTO
import io.witchwitch.craft.domain.achievement.Achievement
import io.witchwitch.craft.domain.achievement.AchievementKey
import io.witchwitch.craft.domain.achievement.AchievementType
import io.witchwitch.craft.repository.AchievementRepository
import io.witchwitch.craft.repository.CollectionRepository
import io.witchwitch.craft.service.dto.CollectionDTO
import org.slf4j.LoggerFactory
import org.springframework.context.MessageSource
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono
import java.util.Locale

@Service
class AchievementService(
) {


    }

    fun getCaseOfFirstPurchase(): Mono<String> {
    }

    fun getCaseOfProductPurchaseType(
    ): Mono<String> {
    }

    fun getCaseOfCollectionFollow(
    ): Mono<String> {
    }

    private fun setName(): String? {
    }

    private fun firstPurchaseCollection(): Mono<Achievement> {
    }

    fun productPurchase(): Mono<Achievement> {
    }

    fun collectionFollow(): Mono<Achievement> {
    }
}
