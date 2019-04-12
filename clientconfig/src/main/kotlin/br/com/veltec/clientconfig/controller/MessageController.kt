package br.com.veltec.clientconfig.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RefreshScope
@RestController
open class MessageController(
    @Value("\${user.role}")
    private val role: String,
    @Value("\${user.password}")
    private val password: String,
    @Value("\${user.msg}")
    private val msg: String) {

    @RequestMapping("/msg")
    fun msg(): String {
        println("Método acionado")
        println("Resposta >> $role - $password - $msg")
        return "Resposta >> $role - $password - $msg"
    }
}