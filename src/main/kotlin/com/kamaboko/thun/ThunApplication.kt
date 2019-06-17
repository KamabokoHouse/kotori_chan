package com.kamaboko.thun

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ThunApplication

fun main(args: Array<String>) {
	runApplication<ThunApplication>(*args){
		setBannerMode(Banner.Mode.OFF)
	}
}
