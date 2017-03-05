package com.richard.AppConfig;/**
 * Created by highl on 05/03/2017.
 */

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;

/**
 * created by highl
 */
@Configuration
public class DataAccessConfig {

    @Bean
    public NamedParameterJdbcTemplate internalJdbcTemplate(@Qualifier("internalDataSource")
                                                                   DataSource internalDataSource) {
        return new NamedParameterJdbcTemplate(internalDataSource);
    }


}
