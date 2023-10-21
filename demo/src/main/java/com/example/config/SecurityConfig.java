package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.filter.CorsFilter;

import com.example.filter.SFilter1;
import com.example.filter.SFilter2;
import com.example.filter.SFilter3;

@Configuration
public class SecurityConfig {

  @Bean
  public SecurityFilterChain sfc1(HttpSecurity http) throws Exception {
    http.antMatcher("/ctrl1/*");
    http.addFilterBefore(new SFilter1(), CorsFilter.class);
    disableDefault(http);
    return http.build();
  }

  @Bean
  public SecurityFilterChain sfc2(HttpSecurity http) throws Exception {
    http.antMatcher("/ctrl2/*");
    http.addFilterBefore(new SFilter2(), CorsFilter.class);
    disableDefault(http);
    return http.build();
  }

  @Bean
  public SecurityFilterChain sfc3(HttpSecurity http) throws Exception {
    http.antMatcher("/ctrl3/*");
    http.addFilterBefore(new SFilter3(), CorsFilter.class);
    disableDefault(http);
    return http.build();
  }

  private void disableDefault(HttpSecurity http) throws Exception {
    http.csrf(csrf -> csrf.disable())
        // .addFilter(new WebAsyncManagerIntegrationFilter()) // TODO: 目前還找不到方法移除 by
        // .addFilter() 添加的 filter
        .exceptionHandling(handling -> handling.disable())
        .headers(headers -> headers.disable())
        .sessionManagement(management -> management.disable())
        .securityContext(context -> context.disable())
        .requestCache(cache -> cache.disable())
        .anonymous(anonymous -> anonymous.disable())
        .servletApi(api -> api.disable())
        .logout(logout -> logout.disable());
  }
}
