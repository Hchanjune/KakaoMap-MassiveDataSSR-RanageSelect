package com.kotlin.spring.sample.controller

import com.kotlin.spring.sample.service.SampleService
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/")
class SampleController(private val sampleService: SampleService) {

    companion object {
        private val logger = LoggerFactory.getLogger(SampleController::class.java)
    }

    @GetMapping("/sample")
    fun testPage(model:Model) : String {
        return "sample"
    }
}