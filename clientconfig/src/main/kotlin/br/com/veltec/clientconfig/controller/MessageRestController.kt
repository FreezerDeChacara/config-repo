package br.com.veltec.clientconfig.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RefreshScope
@RestController
internal class MessageRestController {

    @Value("\${message:Hello default}")
    @get:RequestMapping("/message")
    val message: String? = null
}