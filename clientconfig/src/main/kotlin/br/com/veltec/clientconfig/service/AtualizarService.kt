package br.com.veltec.clientconfig.service

import com.mashape.unirest.http.Unirest
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.util.UriComponentsBuilder
import java.net.URI
import java.time.OffsetDateTime


@Service
open class AtualizarService() {

    private val restTemplate = RestTemplate()

    @Scheduled(initialDelay = 1000, fixedDelay = 6000)
    open fun atualizarConfig() {

    val response = Unirest.post("http://localhost:8080/actuator/refresh")
        .header("Content-Type", "application/json")
        .header("cache-control", "no-cache")
        .header("Postman-Token", "de35152c-173c-4043-854f-1efacb6dbb49")
        .body("{}")
        .asString()

        println("Refrexca >> ${OffsetDateTime.now()} >> [${response.body}]")
    }
}