package com.example.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

// @Component
public class Filter1 implements Filter {

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {

    var req = (HttpServletRequest) request;
    System.out.println("in Filter1 : " + req.getRequestURI());
    chain.doFilter(request, response);
    System.out.println("out Filter1 : " + req.getRequestURI());
  }
}
