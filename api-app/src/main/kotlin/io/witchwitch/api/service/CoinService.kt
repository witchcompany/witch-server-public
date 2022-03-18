package io.witchwitch.api.service

import io.witchwitch.api.domain.wallet.Wallet
import io.witchwitch.api.repository.WalletLogRepository
import io.witchwitch.api.repository.WalletRepository
import io.witchwitch.api.service.dto.WalletDTO
import io.witchwitch.api.service.dto.WalletLogDTO
import io.witchwitch.api.service.mapper.WalletLogMapper
import io.witchwitch.api.service.mapper.WalletMapper
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class CoinService(
    private val pushNotificationService: PushNotificationService,
    private val walletRepository: WalletRepository,
    private val walletLogRepository: WalletLogRepository,
    private val walletMapper: WalletMapper,
    private val walletLogMapper: WalletLogMapper
) {
    companion object {
    }

    private val log = LoggerFactory.getLogger(javaClass)

    fun findWallet(): Mono<WalletDTO> {
    }

    fun createCoinPaymentPush() {
    }

    @Transactional
    fun addCoinToWallet(
    ): Mono<WalletDTO> {
    }

    @Transactional
    fun subtractCoinToWallet(
    ): Mono<WalletDTO> {
    }

    fun findAllWalletLog(): Flux<WalletLogDTO> {
    }

    fun existsWalletLogByTarget(
    ): Mono<Boolean> {
    }

    fun existsWalletLogByTarget(
    ): Mono<Boolean> {
    }

    @Transactional
    fun coinWithdraw(): Mono<WalletDTO> {
    }

    private fun createWallet(): Mono<Wallet> {
    }
}
