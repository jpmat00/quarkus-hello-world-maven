package com.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jep.Interpreter;
import jep.SharedInterpreter;

@Path("/hello-quarkus")
public class Main {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        try (Interpreter jep = new SharedInterpreter()) {
            jep.eval("print('Hello, from Python!')");
        }
        return "Hello from RESTEasy Reactive";
    }
}
