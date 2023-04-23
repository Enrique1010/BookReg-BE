package com.erapps.bookreg.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class TestController {

    @GetMapping("/klk")
    @ResponseBody
    fun klk(): Test {
        return Test(1, "klk")
    }
}

data class Test(val id: Long, val content: String)