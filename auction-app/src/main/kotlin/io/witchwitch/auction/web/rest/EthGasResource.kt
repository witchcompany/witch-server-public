package io.witchwitch.auction.web.rest

import io.witchwitch.auction.client.EtherscanClient
import io.witchwitch.auction.domain.EtherscanGas
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api")
class EthGasResource(
) {

    @GetMapping("/eth-gas")
    fun getEthGas(): Mono<EtherscanGas.EthGas> {
    }
}
