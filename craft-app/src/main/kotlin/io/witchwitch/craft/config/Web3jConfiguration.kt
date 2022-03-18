package io.witchwitch.craft.config

import io.witchwitch.craft.client.Web3jClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.web.reactive.function.client.WebClient
import org.web3j.protocol.Web3j

@Import(Web3jClient::class)
@Configuration
class Web3jConfiguration(
) {

    @Bean
    fun web3j(): Web3j {
    }

    @Bean
    fun web3jWebClient(): WebClient {
    }
}
