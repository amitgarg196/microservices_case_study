package com.learning.casestudy.subscriptionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="api-gateway-service") //removed hardcoded url to use ribbon. Finally, also removed service name to use API gateway.
@RibbonClient(name="book-service")
public interface BookServiceProxy {
     @GetMapping("/book-service/books")
     public Book[] retrieveBooks();
}
