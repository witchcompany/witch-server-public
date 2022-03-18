package io.witchwitch.core.web.rest.errors

import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpHeaders
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.zalando.problem.Problem
import org.zalando.problem.ProblemBuilder
import org.zalando.problem.spring.webflux.advice.ProblemHandling
import org.zalando.problem.spring.webflux.advice.security.SecurityAdviceTrait
import reactor.core.publisher.Mono


/**
 * Controller advice to translate the server side exceptions to client-friendly json structures.
 * The error response follows RFC7807 - Problem Details for HTTP APIs (https://tools.ietf.org/html/rfc7807).
 */
@ControllerAdvice
class ExceptionTranslator() : ProblemHandling, SecurityAdviceTrait {


    @Value("\${spring.application.name}")
    private val applicationName: String? = null

    /**
     * Post-process the Problem payload to add the message key for the front-end if needed.
     */
    override fun process(): Mono<ResponseEntity<Problem>> {
    }

    override fun handleBindingResult(
    }

    @ExceptionHandler
    fun handleBadRequestAlertException(
    ): Mono<ResponseEntity<Problem>> =

    @ExceptionHandler
    fun handleConcurrencyFailure(
    ): Mono<ResponseEntity<Problem>> {
    }

    override fun prepare(): ProblemBuilder {
    }

    private fun createFailureAlert(
    ): HttpHeaders {
    }

    private fun containsPackageName() =
}
