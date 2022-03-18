package io.witchwitch.core.config

import org.springframework.context.annotation.Configuration
import org.springframework.format.FormatterRegistry
import org.springframework.format.datetime.standard.DateTimeFormatterRegistrar
import org.springframework.web.reactive.config.WebFluxConfigurer

/**
 * Configure the converters to use the ISO format for dates by default.
 */
@Configuration
class DateTimeFormatConfiguration : WebFluxConfigurer {

    override fun addFormatters(registry: FormatterRegistry) {
    }
}
