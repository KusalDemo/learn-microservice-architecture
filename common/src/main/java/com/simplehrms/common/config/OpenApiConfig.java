package com.simplehrms.common.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "${openapi.service.title}",
                version = "${openapi.service.version}"
        ),
        servers = {
                @Server(url = "${openapi.service.url}")
        }
)
public class OpenApiConfig {
}