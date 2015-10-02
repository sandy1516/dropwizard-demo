package com.san.pro.config;

import javax.validation.constraints.NotNull;

/**
 * Created by sandeepkumar.s on 9/29/2015.
 */
@SuppressWarnings("UnusedDeclaration")
public class MessageConfiguration {

    @NotNull
    String hello;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
