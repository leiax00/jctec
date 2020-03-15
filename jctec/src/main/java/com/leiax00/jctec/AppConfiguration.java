package com.leiax00.jctec;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootConfiguration
@ComponentScan("com.leiax00.jctec")
@EnableTransactionManagement
@EntityScan(basePackages = "com.**.entity")
@MapperScan("com.**.mapper")
public class AppConfiguration {
}
