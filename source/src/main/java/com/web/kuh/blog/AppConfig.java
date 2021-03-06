package com.web.kuh.blog;


import com.web.kuh.blog.common.filter.RequestMapFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;

@Configuration
public class AppConfig {

    @Bean
    public FilterRegistrationBean filterConfig(){
        FilterRegistrationBean filter = new FilterRegistrationBean(new RequestMapFilter());
        return filter;
    }

}
