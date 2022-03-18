package io.witchwitch.craft.client

import io.witchwitch.craft.contracts.Wcraft
import io.witchwitch.craft.domain.TokenItem
import org.springframework.stereotype.Service
import org.web3j.protocol.core.methods.response.TransactionReceipt
import org.web3j.tx.gas.StaticGasProvider
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class Web3jClient(
) {


    fun findAllTokenIds(): Mono<Array<String>> {
    }

    fun getWcraftContract(): Wcraft {
    }

    fun getTokenItem(): Mono<TokenItem> {
    }

    fun mint(): Flux<TransactionReceipt> {
    }

    fun getGasProvider(): Mono<StaticGasProvider> {
    }

    private fun getStaticGasProvider(): Mono<StaticGasProvider> {
    }

    fun getEthPrice(): Mono<Array<Any>> {
    }

    fun getRequiredWit(): Mono<Long> {
    }

    private fun getKeyWrapping(): String {
    }
}
