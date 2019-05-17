package com.kubernetes;

import com.kubernetes.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Config.class)
public class SpringKubernetesExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringKubernetesExampleApplication.class, args);
	}

}
