package com.zjgsu.web;

import com.zjgsu.Entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zby on 2017/6/28.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private static List<User> userList;

    public UserController() {
        super();
        userList = new ArrayList<User>();
    }

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerForm(){
        logger.info("registerForm方法……");
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestParam("loginname") String loginname,
                           @RequestParam("password") String password,
                           @RequestParam("username") String username) {
        logger.info("register方法……");
        User user = new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        user.setUsername(username);
        userList.add(user);
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("loginname") String loginname,
                        @RequestParam("password") String password,
                        Model model){
        logger.info("login方法……");
        for (User user : userList){
            if (user.getLoginname().equals(loginname) &&
                    user.getPassword().equals(password)){
                model.addAttribute("user",user);
                return "welcome";
            }
        }
        return "registerForm";
    }
}
