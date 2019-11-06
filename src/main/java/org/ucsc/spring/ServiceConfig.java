package org.ucsc.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "org.ucsc.service" })
public class ServiceConfig {
}
