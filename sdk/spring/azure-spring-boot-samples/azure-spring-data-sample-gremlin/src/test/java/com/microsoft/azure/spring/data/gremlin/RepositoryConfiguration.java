// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.spring.data.gremlin;

import com.microsoft.azure.spring.data.gremlin.common.GremlinConfig;
import com.microsoft.azure.spring.data.gremlin.config.AbstractGremlinConfiguration;
import com.microsoft.azure.spring.data.gremlin.config.GremlinProperties;
import com.microsoft.azure.spring.data.gremlin.repository.config.EnableGremlinRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@EnableGremlinRepositories(basePackages = "com.microsoft.azure.spring.data.gremlin.repository")
@EnableConfigurationProperties(GremlinProperties.class)
@PropertySource("classpath:application.yml")
public class RepositoryConfiguration extends AbstractGremlinConfiguration {

    @Autowired
    private GremlinProperties gremlinProps;

    @Override
    public GremlinConfig getGremlinConfig() {
        return GremlinConfig.newBuilder()
            .endpoint(gremlinProps.getEndpoint())
            .port(gremlinProps.getPort())
            .username(gremlinProps.getUsername())
            .password(gremlinProps.getPassword())
            .sslEnabled(gremlinProps.isSslEnabled())
            .telemetryAllowed(gremlinProps.isTelemetryAllowed())
            .serializer(gremlinProps.getSerializer())
            .maxContentLength(gremlinProps.getMaxContentLength())
            .build();
    }
}
