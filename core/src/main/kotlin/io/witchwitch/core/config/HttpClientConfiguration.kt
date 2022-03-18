package io.witchwitch.core.config

import com.paypal.core.PayPalHttpClient
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(HttpClientConfigurationProperties::class)
class HttpClientConfiguration(
    private val httpClientConfigurationProperties: HttpClientConfigurationProperties
) {
    @Bean
    fun payPalHttpClient(): PayPalHttpClient {
    }
}
