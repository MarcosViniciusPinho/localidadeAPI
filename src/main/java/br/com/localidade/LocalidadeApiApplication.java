package br.com.localidade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class LocalidadeApiApplication {

//	@Autowired
//	private Environment env;
//
//	@Bean
//	public DataSource dataSource() {
//		DriverManagerDataSource ds = new DriverManagerDataSource();
//		ds.setDriverClassName(env.getProperty("com.mysql.jdbc.Driver"));
//		ds.setUrl(env.getProperty("DATABASE_URL"));
//		ds.setUsername(env.getProperty("DATABASE_USER"));
//		ds.setPassword(env.getProperty("DATABASE_PASSWORD"));
//		return ds;
//	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://nuskkyrsgmn5rw8c.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/lw9a8evt3wv574zu");
		ds.setUsername("qxhvj7ae5h4ny8ep");
		ds.setPassword("wlezgn7tlylw7wgf");
		return ds;
	}

	public static void main(String[] args) {
		SpringApplication.run(LocalidadeApiApplication.class, args);
	}

//	@Bean
//	public DataSource dataSource() {
//		return DataSourceBuilder.create().build();
//	}

}
