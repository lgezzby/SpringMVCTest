package com.zjgsu.web;

import Entity.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zby on 2017/6/30.
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @RequestMapping(value = "/{formName}")
    public String loginForm(@PathVariable("formName") String formName){
        return formName;
    }

    @RequestMapping(value = "test", method = RequestMethod.POST)
    public String test(@ModelAttribute Account account,
                       Model model){
        logger.info(account.toString());
        model.addAttribute("account",account);
        return "success";
    }
}
