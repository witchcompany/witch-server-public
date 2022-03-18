package io.witchwitch.core.config

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider
import software.amazon.awssdk.regions.Region
import software.amazon.awssdk.services.secretsmanager.SecretsManagerClient
import software.amazon.awssdk.services.secretsmanager.model.DecryptionFailureException
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueRequest
import software.amazon.awssdk.services.secretsmanager.model.InternalServiceErrorException
import software.amazon.awssdk.services.secretsmanager.model.InvalidRequestException
import software.amazon.awssdk.services.secretsmanager.model.ResourceNotFoundException
import java.security.InvalidParameterException

@Configuration
class SecretsManagerConfiguration(
    @Value("\${aws.secretsmanager.region}")
    private val region: String,
    @Value("\${aws.secretsmanager.secretName}")
    private val secretName: String,
) {
    private val log = LoggerFactory.getLogger(javaClass)

    @Bean
    fun secretsManager(credentialsProvider: AwsCredentialsProvider): JsonNode {
    }
}
