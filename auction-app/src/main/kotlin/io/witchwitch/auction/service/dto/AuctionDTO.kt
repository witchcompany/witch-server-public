package io.witchwitch.auction.service.dto

import io.witchwitch.auction.domain.TokenItem
import io.witchwitch.auction.domain.auction.AuctionContract
import io.witchwitch.auction.domain.auction.AuctionStatus
import io.witchwitch.auction.domain.auction.AuctionType
import java.math.BigDecimal
import java.time.Instant

data class AuctionDTO(
) {
    fun getAuctionStatus(): AuctionStatus? {
    }

    fun isFinished(): Boolean {
    }
}
