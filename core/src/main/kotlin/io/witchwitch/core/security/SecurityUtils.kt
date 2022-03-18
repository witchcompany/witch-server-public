@file:JvmName("SecurityUtils")

package io.witchwitch.core.security

import org.springframework.security.core.Authentication
import org.springframework.security.core.GrantedAuthority
import reactor.core.publisher.Mono

/**
 * Get the login of the current user.
 *
 * @return the login of the current user.
 */
fun getCurrentUserLogin(): Mono<String> =

fun extractPrincipal(authentication: Authentication?): String? {
}

fun getCurrentUserId(): Mono<String> =

/**
 * Check if a user is authenticated.
 *
 * @return true if the user is authenticated, false otherwise.
 */
fun isAuthenticated(): Mono<Boolean> {
}

/**
 * If the current user has a specific authority (security role).
 *
 * The name of this method comes from the `isUserInRole()` method in the Servlet API
 *
 * @param authority the authority to check.
 * @return true if the current user has the authority, false otherwise.
 */
fun isCurrentUserInRole(authority: String): Mono<Boolean> {
}

fun extractAuthorityFromClaims(claims: Map<String, Any>): List<GrantedAuthority> {
}

@Suppress("UNCHECKED_CAST")
fun getRolesFromClaims(claims: Map<String, Any>): Collection<String> {
}

fun mapRolesToGrantedAuthorities(roles: Collection<String>): List<GrantedAuthority> {
}
