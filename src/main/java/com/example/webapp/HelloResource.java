package com.example.webapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello-world")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        System.out.println("hello git");
        System.out.println("hello git2");
        System.out.println("hello git3");
        System.out.println("master test");
        System.out.println("branch test");
        System.out.println("push test");
        System.out.println("pull test");
    }
}
