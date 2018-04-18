package org.userWeb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@MapperScan("org.userDao")
@ComponentScan("org.userDao,org.userService,org.userDomain,org.userWeb")
public class App extends SpringBootServletInitializer 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
