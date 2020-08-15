package com.lyit.multicloud.InventoryService.configurations;

import com.googlecode.objectify.ObjectifyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Objectify Configuration
 * https://github.com/objectify/objectify
 */

@Configuration
public class ObjectifyConfiguration {

    @Bean
    public FilterRegistrationBean<ObjectifyFilter> objectifyFilterRegistration() {
        final FilterRegistrationBean<ObjectifyFilter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new ObjectifyFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }

}