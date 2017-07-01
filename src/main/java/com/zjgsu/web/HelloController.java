package com.zjgsu.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zby on 2017/6/28.
 */
@Controller
@RequestMapping(value = "/hello")
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/login/{username}",method = RequestMethod.GET)
    public String show(@PathVariable("username") String username, Model model){
        logger.info("show方法 被调用");
        model.addAttribute("username",username);
        return "show";
    }
}
