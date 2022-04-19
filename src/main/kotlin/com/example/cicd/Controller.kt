package com.example.cicd

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {

    @GetMapping("/get")
    fun getTestController(@RequestParam message : String) : String {
        print(message)
        return "hello"
    }

    @PostMapping("/post")
    fun postTestController(@RequestBody postDto: PostDto) : PostDto{
        println(postDto.name)
        println(postDto.id)
        return postDto;
    }

}