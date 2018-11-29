package com.wildfly.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class ExampleController {

    @Autowired
    private HttpServletRequest context;

    @RequestMapping("/")
    public String exampleHelloWorld(HttpServletRequest request,
                                    HttpServletResponse response) {
        int requestPort = request.getLocalPort(); // By Controller HttpServletRequest ( you could use any example of ServletRequest)
        int localPort = context.getLocalPort(); // By Autowiring HttpServletRequest
        return "Showing the application ports. Port by Controller request: '" + requestPort + "', \n Port By Autowiring field:'" + localPort + "'";
    }

}
