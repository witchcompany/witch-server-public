package io.witchwitch.api.repository

import io.witchwitch.api.domain.wallet.WalletLog
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface WalletLogRepository : ReactiveMongoRepository<WalletLog, String> {
}
