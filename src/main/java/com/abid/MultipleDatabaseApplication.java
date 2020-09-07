package com.abid;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class MultipleDatabaseApplication {




	public static void main(String[] args) {

		SpringApplication.run(MultipleDatabaseApplication.class, args);

	}

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}
	
	
	@Bean("dsSubscription")
	@ConfigurationProperties(prefix = "spring.subscription.datasource")
	public DataSource subscriptionDataSource() {
		DataSource dataSource = DataSourceBuilder.create().build();
		return dataSource;
	}
	@Bean(name = "jdbcSubscription")
	public JdbcTemplate subscriptionJdbcTemplate(@Qualifier("dsSubscription")DataSource dsSitep) { 
		return new JdbcTemplate(dsSitep); 
	}

	@Bean("dsSmsgw")
	@Primary
	@ConfigurationProperties(prefix = "spring.smsgw.datasource")
	public DataSource smsgwDataSource() {
		DataSource dataSource = DataSourceBuilder.create().build();
		return dataSource;
	}
	@Bean(name = "jdbcSmsgw") 
	public JdbcTemplate smsgwJdbcTemplate(@Qualifier("dsSmsgw")DataSource dsBugs) { 
		return new JdbcTemplate(dsBugs); 
	}

}
