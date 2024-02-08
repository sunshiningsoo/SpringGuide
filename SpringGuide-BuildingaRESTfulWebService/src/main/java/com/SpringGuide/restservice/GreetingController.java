package com.SpringGuide.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController // @Controller + @ResponseBody
public class GreetingController {

    private static final String template = "Hello %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting") //@RequestMapping(method=GET)
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        // Jackson2 -> MappingJackson2HttpMessageConverter가 Greeting 객체 -> json으로 convert함
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
