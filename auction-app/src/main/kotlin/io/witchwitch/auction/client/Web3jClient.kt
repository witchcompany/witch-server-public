package io.witchwitch.auction.client

import io.witchwitch.auction.domain.TokenItem
import org.springframework.stereotype.Service
import org.web3j.protocol.core.methods.response.EthGetTransactionReceipt
import org.web3j.protocol.core.methods.response.EthTransaction
import org.web3j.protocol.core.methods.response.Transaction
import org.web3j.tx.gas.StaticGasProvider
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class Web3jClient(
) {

    fun getWitchAuctionContract(): WitchAuction {
    }

    fun getTokenItem(): Mono<TokenItem> {
    }

    fun getWitchContract(): WITCH {
    }

    fun getTransactionByHash(): Mono<EthTransaction> {
    }

    fun getTransactionReceipt(): Mono<EthGetTransactionReceipt> {
    }

    fun getGasProvider(): Mono<StaticGasProvider> {
    }

    private fun getStaticGasProvider(): Mono<StaticGasProvider> {
    }

    fun getTransactionFlowable(): Flux<Transaction> {
    }

}
