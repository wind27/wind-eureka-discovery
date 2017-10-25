package com.wind.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.web.*;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Import;

//@Import({ DispatcherServletAutoConfiguration.class, EmbeddedServletContainerAutoConfiguration.class,
//		ErrorMvcAutoConfiguration.class, HttpEncodingAutoConfiguration.class,
//		HttpMessageConvertersAutoConfiguration.class, JacksonAutoConfiguration.class, MultipartAutoConfiguration.class,
//		ServerPropertiesAutoConfiguration.class, WebMvcAutoConfiguration.class })
@EnableEurekaServer
@SpringBootApplication
public class DiscoveryApplicationMasterMain {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryApplicationMasterMain.class, args);
	}
}
