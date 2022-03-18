package io.witchwitch.core.config

import io.witchwitch.core.config.audit.AuditConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.core.convert.converter.Converter
import org.springframework.core.env.Environment
import org.springframework.data.convert.ReadingConverter
import org.springframework.data.convert.WritingConverter
import org.springframework.data.elasticsearch.config.ElasticsearchConfigurationSupport
import org.springframework.data.elasticsearch.config.EnableElasticsearchAuditing
import org.springframework.data.elasticsearch.core.convert.ElasticsearchCustomConversions
import org.springframework.data.elasticsearch.core.mapping.SimpleElasticsearchMappingContext
import org.springframework.data.elasticsearch.core.mapping.SimpleElasticsearchPersistentProperty
import org.springframework.data.elasticsearch.repository.config.EnableReactiveElasticsearchRepositories
import java.time.Instant
import java.time.LocalDate
import java.time.ZonedDateTime

@EnableReactiveElasticsearchRepositories("io.witchwitch.core.repository.search")
@EnableElasticsearchAuditing
@Configuration
@Import(AuditConfiguration::class)
class ElasticsearchConfiguration(
    private val environment: Environment
) : ElasticsearchConfigurationSupport() {
    fun getPrefix(): String {
    }

    private fun getPhase(): String {
    }

    @Bean
    override fun elasticsearchCustomConversions() = ElasticsearchCustomConversions(
    )

    @WritingConverter
    class ZonedDateTimeWritingConverter : Converter<ZonedDateTime, String> {
    }

    @ReadingConverter
    class ZonedDateTimeReadingConverter : Converter<String, ZonedDateTime> {
    }

    @WritingConverter
    class InstantWritingConverter : Converter<Instant, String> {
    }

    @ReadingConverter
    class InstantReadingConverter : Converter<String, Instant> {
    }

    @WritingConverter
    class LocalDateWritingConverter : Converter<LocalDate, String> {
    }

    @ReadingConverter
    class LocalDateReadingConverter : Converter<String, LocalDate> {
    }

    @Bean
    override fun elasticsearchMappingContext(elasticsearchCustomConversions: ElasticsearchCustomConversions?): SimpleElasticsearchMappingContext? {
    }

    class CustomElasticsearchMappingContext : SimpleElasticsearchMappingContext() {
    }

    internal class CustomElasticsearchPersistentProperty(
    ) : SimpleElasticsearchPersistentProperty(property, owner, simpleTypeHolder, fieldNamingStrategy) {
    }
}
