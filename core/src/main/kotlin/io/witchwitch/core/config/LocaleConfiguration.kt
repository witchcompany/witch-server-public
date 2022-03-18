package io.witchwitch.core.config

import org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.web.server.i18n.LocaleContextResolver
import java.util.Locale

@Configuration
@Import(WebFluxAutoConfiguration::class)
class LocaleConfiguration {

    @Bean
    fun localeChangeFilter(localeContextResolver: LocaleContextResolver) =

    fun localeConverter(locale: String): Locale =
}
