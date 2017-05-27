package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication(scanBasePackages = { "com.cloudsea.*" })
@EnableSwagger2
@EnableDiscoveryClient
@Import(value = { SpringDataRestConfiguration.class })
public class CloudSeaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudSeaApplication.class, args);
	}

}
