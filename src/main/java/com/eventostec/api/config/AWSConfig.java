package com.eventostec.api.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AWSConfig {

    @Value("${aws.region}")
    private String awsRegion;

    @Value("${aws.access-key-id}")
    private String accessKeyId;

    @Value("${aws.secret-access-key}")
    private String secretAccessKey;

    @Value("${aws.s3.endpoint:}")
    private String s3Endpoint;

    @Bean
    public AmazonS3 createInstance() {
        var credentials = new BasicAWSCredentials(accessKeyId, secretAccessKey);
        var builder = AmazonS3ClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials));

        if (!s3Endpoint.isBlank()) {
            builder.withEndpointConfiguration(
                    new AwsClientBuilder.EndpointConfiguration(s3Endpoint, awsRegion)
            );
            builder.withPathStyleAccessEnabled(true);
        } else {
            builder.withRegion(awsRegion);
        }

        return builder.build();
    }
}
