package com.example.webdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @package com.example.webdemo.web
 * @class MinaController
 * @author Darrick
 * @date 2017/11/22 17:07
 * @description
 * @versions 1.0
 */
@CrossOrigin
@Controller
public class MinaController {


    @RequestMapping(value = "/mina",method = RequestMethod.GET)
    public String getMinaInfo(){

        return "mina";
    }


}
