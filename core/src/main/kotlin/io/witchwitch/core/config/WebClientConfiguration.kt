package io.witchwitch.core.config

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
@EnableConfigurationProperties(WebClientConfigurationProperties::class)
class WebClientConfiguration(
) {
    @Bean
    fun authWebClient(): WebClient {
    }

    @Bean
    fun keycloakAdminWebClient(
    ): WebClient {
    }

    @Bean
    fun iamportWebClient(): WebClient {
    }
}
