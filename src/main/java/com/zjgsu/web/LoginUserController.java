package com.zjgsu.web;

import com.zjgsu.entity.LoginUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by zby on 2017/7/1.
 */
@Controller
@RequestMapping("/loginUser")
public class LoginUserController {
    private static final Logger logger = LoggerFactory.getLogger(LoginUserController.class);

    @RequestMapping(value = "/{formName}")
    public String loginForm(@PathVariable String formName,
                            Model model){
        LoginUser loginUser = new LoginUser();
        model.addAttribute("loginUser",loginUser);

        return formName;
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@Valid @ModelAttribute LoginUser loginUser,
                        Errors errors,
                        Model model){
        logger.info(loginUser.toString());
        if (errors.hasErrors()){
            return "registerUser";
        }
        model.addAttribute("loginUser",loginUser);
        return "loginSuccess";
    }
}
