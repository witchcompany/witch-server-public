package io.witchwitch.core.config

import com.google.api.services.people.v1.PeopleService
import com.google.firebase.FirebaseApp
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.io.IOException

@Configuration
class GoogleConfiguration {
    @Bean
    @Throws(IOException::class)
    fun firebaseApp(): FirebaseApp {
    }

    @Bean
    fun peopleService(): PeopleService {
    }
}
