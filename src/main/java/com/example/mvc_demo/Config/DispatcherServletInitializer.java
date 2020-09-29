package com.example.mvc_demo.Config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("GET ROOT CONFIG");
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("::::::::::::getSErvletConfigClasses::::::::");
        return new Class[]{AppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println(":::::::::::::Servlet-Mapping::::::");
        return new String[]{"/"};
    }
}
