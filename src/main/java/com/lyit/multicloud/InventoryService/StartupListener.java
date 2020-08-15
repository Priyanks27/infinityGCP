package com.lyit.multicloud.InventoryService;

import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.VoidWork;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Does any initialization at startup
 */

@WebListener
public class StartupListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        registerModals();

        ObjectifyService.run(new VoidWork() {
            @Override
            public void vrun() {
                //To load ConfigModal into cache
            }
        });
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

    private void registerModals() {
    }
}