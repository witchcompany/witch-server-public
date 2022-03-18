package io.witchwitch.core.config

import com.fasterxml.jackson.databind.ObjectMapper
import io.witchwitch.core.config.resolver.UserAgentMethodArgumentResolver
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.annotation.Order
import org.springframework.core.env.Environment
import org.springframework.data.web.ReactivePageableHandlerMethodArgumentResolver
import org.springframework.data.web.ReactiveSortHandlerMethodArgumentResolver
import org.springframework.web.cors.reactive.CorsWebFilter
import org.springframework.web.reactive.config.WebFluxConfigurer
import org.springframework.web.server.WebExceptionHandler
import org.zalando.problem.spring.webflux.advice.ProblemHandling

@Configuration
class WebConfigurer(
    private val environment: Environment
) : WebFluxConfigurer {

    private val log = LoggerFactory.getLogger(javaClass)

    @Bean
    fun corsFilter(): CorsWebFilter {
    }

    @Bean
    fun reactivePageableHandlerMethodArgumentResolver() = ReactivePageableHandlerMethodArgumentResolver()

    @Bean
    fun reactiveSortHandlerMethodArgumentResolver() = ReactiveSortHandlerMethodArgumentResolver()

    @Bean
    fun userAgentMethodArgumentResolver() = UserAgentMethodArgumentResolver()

    @Bean
    @Order(-2) // The handler must have precedence over WebFluxResponseStatusExceptionHandler and Spring Boot's ErrorWebExceptionHandler
    fun problemExceptionHandler(mapper: ObjectMapper, problemHandling: ProblemHandling): WebExceptionHandler {
    }
}
