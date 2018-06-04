package br.com.localidade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.DependsOn;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@DependsOn("appConfig")
public class LocalidadeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocalidadeApiApplication.class, args);
	}

//	@Bean
//	public DataSource dataSource() {
//		return DataSourceBuilder.create().build();
//	}
}
