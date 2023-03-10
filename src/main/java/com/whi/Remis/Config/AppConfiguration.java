
package com.whi.Remis.Config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class AppConfiguration {
	
	@Bean
	@Primary
	@ConfigurationProperties(prefix = "spring.primary")
	public DataSource primaryDataSource()
	{
		return DataSourceBuilder.create().build();
	}
	
	@Bean
	public JdbcTemplate primaryJdbcTemplate(@Qualifier("primaryDataSource") DataSource dataSource)
	{
		return new JdbcTemplate(dataSource);
	}
}
