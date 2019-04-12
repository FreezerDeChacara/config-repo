package br.com.veltec.clientconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageJavaController {
    @Value("${user.role}")
    private String role;

    @Value("${user.password}")
    private String password;

    @Value("${user.msg}")
    private String msg;

    @RequestMapping(value = "/messages")
    public String msg() {
        System.out.println("Método acionado");
        System.out.println("Resposta >> " + role + " - " + password + " - " + msg);
        return "Resposta >> " + role + " - " + password + " - " + msg;
    }
}
