package com.lyit.multicloud.InventoryService.configurations;

import com.lyit.multicloud.InventoryService.StartupListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration file to register Listeners specific to InAppNotificationModule
 */

@Configuration
public class ListenerConfiguration {

    @Bean
    public ServletListenerRegistrationBean<StartupListener> listenerRegistrationBean() {
        ServletListenerRegistrationBean<StartupListener> servletListenerRegistrationBean =
                new ServletListenerRegistrationBean<>();
        servletListenerRegistrationBean.setListener(new StartupListener());
        return servletListenerRegistrationBean;
    }

}
