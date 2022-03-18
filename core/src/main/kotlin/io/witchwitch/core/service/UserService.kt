package io.witchwitch.core.service

import io.witchwitch.core.domain.User
import io.witchwitch.core.service.dto.UserDTO
import org.springframework.security.core.context.ReactiveSecurityContextHolder
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class UserService(
) {


    fun updateUser(): Mono<UserDTO> {
    }

    fun updateUser(
    ): Mono<User> {
    }

    private fun saveUser(): Mono<User> {
    }

    fun getUserWithAuthoritiesByLogin(): Mono<User> {
    }

    fun getAuthorities(): Flux<String> {
    }

    private fun syncUserWithIdP(): Mono<User> {
    }

    private fun getGooglePeople() = ReactiveSecurityContextHolder.getContext()

    @Transactional
    fun deactivate(): Mono<Void> {
    }

    fun getUserFromAuthentication(): Mono<UserDTO> {
    }

    fun registerUser(): Mono<Void> {
    }

    fun findById(): Mono<UserDTO> {
    }

    companion object {

        @JvmStatic
        private fun getUser(): User {
        }
    }
}
