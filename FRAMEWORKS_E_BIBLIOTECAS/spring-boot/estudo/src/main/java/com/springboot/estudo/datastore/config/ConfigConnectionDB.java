package com.springboot.estudo.datastore.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;


@Configuration(proxyBeanMethods = false)
public class ConfigConnectionDB {

    @Bean
    @ConfigurationProperties( prefix = "app.datasource")
    public DataSource getConnection() {
        return DataSourceBuilder.create().build();
    }


}
