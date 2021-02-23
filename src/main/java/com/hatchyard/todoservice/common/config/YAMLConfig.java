package com.hatchyard.todoservice.common.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * YAMLConfig
 * All rights reserved.
 * Created by Pc on 2/19/2021
 * Copyright(c) 2021 DirectFN to present.
 */
@Configuration
@EnableConfigurationProperties
@Data
@AllArgsConstructor
@NoArgsConstructor
public class YAMLConfig {

private String version;
private String description;

}
