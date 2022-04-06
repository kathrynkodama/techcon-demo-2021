package com.demo.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;

import org.junit.jupiter.api.Test;


public class HelloIT {

    @Test
    public void HelloTest() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:9080/techcon-demo/api/hello");
        Response response = target.request().get();
        String actual = response.readEntity(String.class);

        assertEquals("Hello TechCon!", actual);
    }
    
}
