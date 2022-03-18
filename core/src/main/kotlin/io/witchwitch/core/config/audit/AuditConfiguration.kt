package io.witchwitch.core.config.audit

import io.witchwitch.core.config.SYSTEM_ACCOUNT
import io.witchwitch.core.security.getCurrentUserLogin
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.domain.ReactiveAuditorAware
import reactor.core.publisher.Mono

@Configuration
class AuditConfiguration {
    @Bean
    fun reactiveAuditorAware(): ReactiveAuditorAware<String> {
    }
}
