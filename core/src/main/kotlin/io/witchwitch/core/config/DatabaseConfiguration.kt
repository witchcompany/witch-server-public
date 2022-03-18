package io.witchwitch.core.config

import com.github.cloudyrock.spring.v5.MongockSpring5
import io.witchwitch.core.config.audit.AuditConfiguration
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration
import org.springframework.boot.autoconfigure.mongo.MongoReactiveAutoConfiguration
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.FilterType
import org.springframework.context.annotation.Import
import org.springframework.context.annotation.Profile
import org.springframework.data.mongodb.ReactiveMongoDatabaseFactory
import org.springframework.data.mongodb.config.EnableReactiveMongoAuditing
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.mapping.event.ValidatingMongoEventListener
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories
import org.springframework.transaction.ReactiveTransactionManager
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean

@Configuration
@EnableReactiveMongoAuditing
@EnableReactiveMongoRepositories(
    basePackages = ["io.witchwitch"],
    includeFilters = [ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = [ReactiveMongoRepository::class])]
)
@EntityScan("io.witchwitch")
@Profile("!$SPRING_PROFILE_CLOUD")
@Import(value = [MongoAutoConfiguration::class, MongoReactiveAutoConfiguration::class, AuditConfiguration::class])
class DatabaseConfiguration {

    private val log = LoggerFactory.getLogger(javaClass)

    @Bean
    fun validatingMongoEventListener() = ValidatingMongoEventListener(validator())

    @Bean
    fun validator() = LocalValidatorFactoryBean()

    @Bean
    fun mongockInitializingBeanRunner(
        springContext: ApplicationContext,
        mongoTemplate: MongoTemplate,
        @Value("\${mongock.lock.lockAcquiredForMinutes:5}") lockAcquiredForMinutes: Long,
        @Value("\${mongock.lock.maxWaitingForLockMinutes:3}") maxWaitingForLockMinutes: Long,
        @Value("\${mongock.lock.maxTries:3}") maxTries: Int
    ): MongockSpring5.MongockInitializingBeanRunner {
    }

    @Bean
    fun transactionManager(reactiveMongoDatabaseFactory: ReactiveMongoDatabaseFactory): ReactiveTransactionManager? {
    }
}
