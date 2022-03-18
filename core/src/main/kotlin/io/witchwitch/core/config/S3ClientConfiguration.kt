package io.witchwitch.core.config

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider
import software.amazon.awssdk.services.s3.S3AsyncClient
import software.amazon.awssdk.services.s3.transform.GetObjectRequestMarshaller

@Configuration
@EnableConfigurationProperties(S3ClientConfigurationProperties::class)
class S3ClientConfiguration(
) {
    @Bean
    fun s3client(credentialsProvider: AwsCredentialsProvider): S3AsyncClient {
    }

    @Bean
    fun awsCredentialsProvider(): AwsCredentialsProvider {
    }

    @Bean
    fun getObjectRequestMarshaller(): GetObjectRequestMarshaller {
    }
}
