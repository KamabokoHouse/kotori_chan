package com.kamaboko.thun.application

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/"])
class Kotori {

    @RequestMapping(method = [RequestMethod.GET])
    fun get(): String {
        return "(・8・)"
    }

}