package io.witchwitch.api.web.rest

import io.witchwitch.core.service.dto.UserDTO
import io.witchwitch.core.web.client.keycloak.response.TokenResponse
import io.witchwitch.core.web.rest.vm.ManagedUserVM
import io.witchwitch.core.web.rest.vm.TokenVM
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.security.Principal
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class AccountResource(
) {

    internal class AccountResourceException(message: String) : RuntimeException(message)

    @GetMapping("/account")
    fun getAccount(principal: Principal?): Mono<UserDTO> {
    }

    @PostMapping("/token/refresh")
    fun refreshToken(@Valid @RequestBody tokenVM: TokenVM): Mono<TokenResponse> {
    }

    @PostMapping("/token/{provider}/exchange")
    fun exchangeToken(
        @PathVariable provider: String,
        @Valid @RequestBody tokenVM: TokenVM
    ): Mono<TokenResponse> {
    }

    @PostMapping("/token/{provider}/link")
    fun linkToken(
        @PathVariable provider: String,
        @Valid @RequestBody tokenVM: TokenVM
    ): Mono<Void> {
    }

    @DeleteMapping("/deactivate")
    fun deactivate(): Mono<Void> {
    }

    private fun checkPasswordLength(password: String?) =
        !password.isNullOrEmpty() &&
            password.length >= ManagedUserVM.PASSWORD_MIN_LENGTH &&
            password.length <= ManagedUserVM.PASSWORD_MAX_LENGTH
}
