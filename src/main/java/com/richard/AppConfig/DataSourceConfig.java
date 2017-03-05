package com.richard.AppConfig;/**
 * Created by highl on 05/03/2017.
 */

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * created by highl
 */
@Configuration
public class DataSourceConfig {


    @Bean
    @Primary
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource internalDataSource()
    {
        return DataSourceBuilder.create().build();
    }

}
