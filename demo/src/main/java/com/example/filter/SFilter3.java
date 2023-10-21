package com.example.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.filter.GenericFilterBean;

public class SFilter3 extends GenericFilterBean {

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {

    var req = (HttpServletRequest) request;
    System.out.println("in SFilter3 : " + req.getRequestURI());
    chain.doFilter(request, response);
    System.out.println("out SFilter3 : " + req.getRequestURI());
  }
}
