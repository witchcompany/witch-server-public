package io.witchwitch.auction.service

import io.witchwitch.auction.domain.Event
import io.witchwitch.auction.domain.TokenItem
import io.witchwitch.auction.domain.Transaction
import io.witchwitch.auction.domain.auction.Auction
import io.witchwitch.auction.domain.auction.UserAuction
import io.witchwitch.auction.service.dto.AuctionDTO
import io.witchwitch.auction.service.dto.UserAuctionDTO
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.web3j.protocol.core.methods.response.TransactionReceipt
import reactor.core.Disposable
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.math.BigDecimal
import java.math.BigInteger

@Service
class AuctionService(
) {
    private val cache = mutableMapOf<Event.Type, Flux<Event>>()

    private val log = LoggerFactory.getLogger(javaClass)

    fun getAuctionStream(): Flux<AuctionDTO> {
    }

    fun findAll(): Flux<AuctionDTO> {
    }

    fun findAllUpcoming(): Flux<AuctionDTO> {
    }

    fun findAllOngoing(): Flux<AuctionDTO> {
    }

    fun findAllClosed(): Flux<AuctionDTO> {
    }

    fun getAuction(): Mono<AuctionDTO> {
    }

    fun createAuction(): Mono<AuctionDTO> {
    }

    fun updateAuction(): Mono<AuctionDTO> {
    }

    fun createUserAuction(): Mono<UserAuctionDTO> {
    }

    fun tokenTransfer(
    ): Mono<TransactionReceipt> {
    }

    private fun saveInCaseOfError(
    ): Disposable {
    }

    private fun saveInCaseOfSuccess(
    ): Mono<Void> {
    }

    private fun getKeyWrapping(): String {
    }

    private fun getWitchBalance(): Mono<BigInteger> {
    }

    private fun getHecoWitchBalance(): Mono<BigInteger> {
    }

    fun isWitchHolder(): Mono<Boolean> {
    }

    private fun getTransactionInfo(): Mono<Transaction> {
    }

    private fun saveUserAuction(
    ): Mono<UserAuction> {
    }

    private fun fillTokenItem(): Mono<Auction> {
    }

    private fun weiToEthConverter(): BigDecimal {
    }

    private fun modifyUrlProtocol(): String {
    }

    private fun urlInCaseOfError(): Mono<TokenItem> {
    }

    private fun tokenItemOwnerOf(): Mono<String> {
    }

    private fun isWitchNftHolder(): Mono<Boolean> {
    }
}
