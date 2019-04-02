package com.dexterlab.helper.servlets;

import io.undertow.Handlers;
import io.undertow.Undertow;
import io.undertow.server.HttpHandler;
import io.undertow.server.handlers.PathHandler;
import io.undertow.servlet.Servlets;
import io.undertow.servlet.api.DeploymentInfo;
import io.undertow.servlet.api.DeploymentManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;

public class UndertowServer {

    private static Logger logger = LoggerFactory.getLogger(UndertowServer.class);

    public static void main(String[] args) throws ServletException {
        configureServer();
    }

    static void configureServer() throws ServletException {
        DeploymentInfo servletBuilder = Servlets.deployment()
                .setClassLoader(Undertow.class.getClassLoader())
                .setContextPath("/something")
                .setDeploymentName("any crap can go here")
                .addServlets(
                        Servlets.servlet("MessageServlet", HelloServlet.class)
                                .addInitParam("message", "Hello World")
                                .addMapping("/hello"),
                        Servlets.servlet("MyServlet", HelloServlet.class)
                                .addInitParam("message", "MyServlet")
                                .addMapping("/myservlet"));

        DeploymentManager manager = Servlets.defaultContainer().addDeployment(servletBuilder);
        manager.deploy();
        PathHandler path = Handlers.path(Handlers.redirect("/myapp"))
                .addPrefixPath("/myapp", manager.start());

        Undertow server = Undertow.builder()
                .addHttpListener(8080, "localhost")
                .setHandler(path)
                .build();
        server.start();

    }


}
