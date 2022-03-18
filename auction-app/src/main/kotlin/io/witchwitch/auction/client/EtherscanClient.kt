package io.witchwitch.auction.client

import io.witchwitch.auction.domain.EtherscanGas
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
data class EtherscanClient(
) {

    fun getTransactionsByAddress(address: String, startBlock: Int? = 0, endBlock: Int? = 99999999): Mono<String> {
    }

    fun getGasInfo(): Mono<EtherscanGas> {
    }
}
