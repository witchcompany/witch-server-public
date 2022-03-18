package io.witchwitch.core.web.client.keycloak

import io.witchwitch.core.web.client.keycloak.model.UserRepresentation
import io.witchwitch.core.web.client.keycloak.response.TokenResponse
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class KeycloakAdminClient(
) {

    fun deleteUser(): Mono<Void> {
    }

    fun createUser(): Mono<Void> {
    }

    fun getUser(): Mono<UserRepresentation> {
    }

    fun updatePassword(): Mono<Void> {
    }

    fun link(): Mono<Void> {
    }

    fun exchangeToken(): Mono<TokenResponse> {
    }

    fun refreshToken(): Mono<TokenResponse> {
    }

    fun login(): Mono<TokenResponse> {
    }

    fun getExternalToken(): Mono<TokenResponse> {
    }
}
