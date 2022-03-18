package io.witchwitch.core.config.apidoc

import io.swagger.v3.oas.models.OpenAPI
import io.witchwitch.core.config.SPRING_PROFILE_API_DOCS
import org.slf4j.LoggerFactory
import org.springdoc.core.GroupedOpenApi
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
@ConditionalOnWebApplication
@Profile(SPRING_PROFILE_API_DOCS)
class SwaggerConfiguration(
    @Value("\${webclient.keycloak.end-point}")
    private val keycloakEndPoint: String,
    @Value("\${webclient.keycloak.realm}")
    private val realm: String
) {
    private val log = LoggerFactory.getLogger(javaClass)

    @Bean
    fun customOpenAPI(): OpenAPI {
    }

    @Bean
    fun managementOpenApi(): GroupedOpenApi {
    }

    @Bean
    fun apiOpenApi(): GroupedOpenApi {
    }
}
