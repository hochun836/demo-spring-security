package com.example.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.filter.Filter1;
import com.example.filter.Filter2;
import com.example.filter.Filter3;
import com.example.filter.FilterAll;

@Configuration
public class FilterConfig {

  @Bean
  public FilterRegistrationBean<Filter1> f1() {
    var registrationBean = new FilterRegistrationBean<Filter1>();
    registrationBean.setFilter(new Filter1());
    registrationBean.addUrlPatterns("/ctrl1/*");
    registrationBean.setOrder(-9999 + 1);
    registrationBean.setName("f1");
    return registrationBean;
  }

  @Bean
  public FilterRegistrationBean<Filter2> f2() {
    var registrationBean = new FilterRegistrationBean<Filter2>();
    registrationBean.setFilter(new Filter2());
    registrationBean.addUrlPatterns("/ctrl2/*");
    registrationBean.setOrder(-9999 + 2);
    registrationBean.setName("f2");
    return registrationBean;
  }

  @Bean
  public FilterRegistrationBean<Filter3> f3() {
    var registrationBean = new FilterRegistrationBean<Filter3>();
    registrationBean.setFilter(new Filter3());
    registrationBean.addUrlPatterns("/ctrl3/*");
    registrationBean.setOrder(-9999 + 3);
    registrationBean.setName("f3");
    return registrationBean;
  }

  @Bean
  public FilterRegistrationBean<FilterAll> fall() {
    var registrationBean = new FilterRegistrationBean<FilterAll>();
    registrationBean.setFilter(new FilterAll());
    registrationBean.addUrlPatterns("/*");
    registrationBean.setOrder(-9999 + 0);
    registrationBean.setName("fall");
    return registrationBean;
  }
}
