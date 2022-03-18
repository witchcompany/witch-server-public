package io.witchwitch.craft.client

import io.witchwitch.craft.client.model.EtherscanGas
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
data class EtherscanClient(
) {

    fun getGasInfo(): Mono<EtherscanGas> {
    }
}
