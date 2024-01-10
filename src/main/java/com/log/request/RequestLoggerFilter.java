package com.log.request;

import java.io.IOException;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.FizzbuzzserverApplication;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
@Order(1)
public class RequestLoggerFilter implements Filter {

    @Override
    public void doFilter(
      ServletRequest request, 
      ServletResponse response, 
      FilterChain chain) throws IOException, ServletException {
 
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        
        String parameters = req.getRequestURI().replace("/FizzBuzzServer/","");
        if(FizzbuzzserverApplication.requestLoggerWithParameter.containsKey(parameters)) {
        	FizzbuzzserverApplication.requestLoggerWithParameter.put(parameters,FizzbuzzserverApplication.requestLoggerWithParameter.get(parameters)+1);
        }else {
        	FizzbuzzserverApplication.requestLoggerWithParameter.put(parameters,1);
        }
        chain.doFilter(request, response);
      }
}
