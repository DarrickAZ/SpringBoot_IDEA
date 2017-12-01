package com.example.webdemo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 一个新的注解 @RestController。
 当用户请求时，需要有视图渲染的，与请求数据的请求分别使用@Controller与@RestController 。
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    public static Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "/{ip}",method = RequestMethod.GET)
    public String index(@PathVariable(required = false) String ip) {
        LOGGER.info("Hello >>> "+ip);

        return "redirect:/mina";
    }

}