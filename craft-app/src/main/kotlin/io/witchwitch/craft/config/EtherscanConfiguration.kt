package io.witchwitch.craft.config

import io.witchwitch.craft.client.EtherscanClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.web.reactive.function.client.WebClient

@Import(EtherscanClient::class)
@Configuration
class EtherscanConfiguration(
) {

    @Bean
    fun etherscanWebClient(): WebClient {
    }
}
