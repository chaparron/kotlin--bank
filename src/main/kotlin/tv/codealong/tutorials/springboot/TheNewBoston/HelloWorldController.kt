package tv.codealong.tutorials.springboot.TheNewBoston

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/hello")
class HelloWorldController {

    @GetMapping("world") // Coge la dir del RequestMapping y la usa en la función
    // Se podría poner "world" y el endpoint sería api/hello/world
    fun helloWorld():String{
        return ("This is a Rest endPoint")
    }
}