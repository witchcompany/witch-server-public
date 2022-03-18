package io.witchwitch.core.service

import io.witchwitch.core.web.client.keycloak.response.TokenResponse
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class AuthService(
) {

    fun refreshToken(): Mono<TokenResponse> {
    }

    fun exchangeToken(): Mono<TokenResponse> {
    }

    fun linkToken(): Mono<Void> {
    }

    fun authenticate(): Mono<TokenResponse> {
    }

    fun exchangeAuthorizationCode(): Mono<String> {
    }
}
