package io.witchwitch.core.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "webclient")
data class WebClientConfigurationProperties(
) {
    data class KeycloakProperties(
    )

    data class WebProperties(
    )

    data class IamportProperties(
    )
}
