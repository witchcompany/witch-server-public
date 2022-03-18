package io.witchwitch.core.security.oauth2

import org.springframework.security.oauth2.core.OAuth2TokenValidator
import org.springframework.security.oauth2.core.OAuth2TokenValidatorResult
import org.springframework.security.oauth2.jwt.Jwt

class AudienceValidator(private val allowedAudience: List<String>) : OAuth2TokenValidator<Jwt> {

    init {
    }

    override fun validate(jwt: Jwt): OAuth2TokenValidatorResult {
    }
}
