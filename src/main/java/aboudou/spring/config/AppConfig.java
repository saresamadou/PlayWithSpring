package aboudou.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aboudou.spring.aop.Car;

@Configuration
@ComponentScan("aboudou.spring.aop")
@EnableAspectJAutoProxy
public class AppConfig {

	@Bean(name = "car")
	public Car getCar() {
		return new Car();
	}
}
