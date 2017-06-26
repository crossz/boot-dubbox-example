package boot.dubbo.simple.provider.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/*
* ## Configuration classes
* Spring Boot favors Java-based configuration. Although it is possible to call SpringApplication.run() with an XML source, we generally recommend that your primary source is a @Configuration class. Usually the class that defines the main method is also a good candidate as the primary @Configuration.
* ## Importing XML configuration
* If you absolutely must use XML based configuration, we recommend that you still start with a @Configuration class. You can then use an additional @ImportResource annotation to load XML configuration files.
* 
* https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-configuration-classes.html
*/

@Configuration
@ImportResource("classpath:META-INF/spring/applicationContext.xml")
public class DubboConfig {
	public void main(){
		System.out.println("hello......");
	}
	
}
