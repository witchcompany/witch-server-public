package io.witchwitch.core.web.client.keycloak.model


data class GoogleUserInfo(
) : FederatedIdentity {
    override fun getUserId(): String {
    }

    override fun getUsername(): String {
    }
}
