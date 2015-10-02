package com.san.pro.resources;

import com.san.pro.config.MessageConfiguration;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by sandeepkumar.s on 9/29/2015.
 */
@Path("/hello")
public class HelloResource {

    private final MessageConfiguration messageConfiguration;

    public HelloResource(final MessageConfiguration messageConfiguration) {
        this.messageConfiguration = messageConfiguration;
    }

    @GET
    public String get() {
        return messageConfiguration.getHello();
    }
}
