package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bruno on 2/3/17.
 */
@RestController
@RequestMapping("/")
public class Hello {

    @RequestMapping("hello")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
