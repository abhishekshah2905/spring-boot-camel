package com.apacheCamel.config;

import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CamelConfig {
    @Value("${api.path}")
    private String contextPath;

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(
                new CamelHttpTransportServlet(), contextPath + "/*");
        servletRegistrationBean.setName("CamelServlet");
        return servletRegistrationBean;
    }
}
