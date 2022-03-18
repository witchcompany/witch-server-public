package io.witchwitch.api.repository

import io.witchwitch.api.domain.wallet.Wallet
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
interface WalletRepository : ReactiveMongoRepository<Wallet, String> {
}
