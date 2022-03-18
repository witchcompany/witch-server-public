package io.witchwitch.auction.config

import io.witchwitch.auction.client.Web3jClient
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.web.reactive.function.client.WebClient
import org.web3j.protocol.Web3j
import org.web3j.protocol.http.HttpService

@Import(Web3jClient::class)
@Configuration
class Web3jConfiguration(
    @Value("\${web3j.end-point}")
    private val web3jEndPoint: String
) {

    @Bean
    fun web3j(): Web3j {
//        return Web3j.build(webSocketService())
        return Web3j.build(HttpService(web3jEndPoint))
    }

    @Bean
    fun web3jWebClient(): WebClient {
        return WebClient.builder().build()
    }
}
