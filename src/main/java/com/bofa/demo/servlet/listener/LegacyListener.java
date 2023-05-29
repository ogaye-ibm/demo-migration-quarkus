package com.bofa.demo.servlet.listener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class LegacyListener implements HttpSessionListener, ServletContextListener {
    @Override
    public void sessionCreated(HttpSessionEvent sessionEvent) {
        System.out.println(" ***** Session created:: SessionId = " + sessionEvent.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent sessionEvent) {
        System.out.println(" ***** Session destroyed:: SessionId = " + sessionEvent.getSession().getId());
    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext ctx = servletContextEvent.getServletContext();
        System.out.println(" ***** Servlet context path: " + ctx.getContextPath());
    }

    @Override
    public void contextDestroyed( ServletContextEvent servletContextEvent){
        System.out.println(" ***** Servlet context destroyed");
    }
}


