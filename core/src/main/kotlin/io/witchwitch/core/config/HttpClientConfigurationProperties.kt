package io.witchwitch.core.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "httpclient")
data class HttpClientConfigurationProperties(
) {
    data class PaypalProperties(
    )
}
