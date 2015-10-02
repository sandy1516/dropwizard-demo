package com.san.pro;

import com.san.pro.config.AppServiceConfiguration;
import com.san.pro.resources.HelloResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

/**
 * Created by sandeepkumar.s on 9/29/2015.
 */
public class AppService extends Service<AppServiceConfiguration> {

    public static void main(String[] args) throws Exception{
        new AppService().run(args);
    }

    @Override
    public void initialize(Bootstrap<AppServiceConfiguration> bootstrap) {
        bootstrap.setName("dropwizard-demo");
    }

    @Override
    public void run(AppServiceConfiguration appServiceConfiguration, Environment environment) throws Exception {
        environment.addResource(new HelloResource(appServiceConfiguration.getMessageConfiguration()));

    }
}
