package com.san.pro.config;

import com.yammer.dropwizard.config.Configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by sandeepkumar.s on 9/29/2015.
 */
@SuppressWarnings("UnusedDeclaration")
public class AppServiceConfiguration extends Configuration {

    @NotNull
    @Valid
    private MessageConfiguration messageConfiguration;

    public MessageConfiguration getMessageConfiguration() {
        return messageConfiguration;
    }

    public void setMessageConfiguration(MessageConfiguration messageConfiguration) {
        this.messageConfiguration = messageConfiguration;
    }

}
