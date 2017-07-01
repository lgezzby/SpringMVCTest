package com.zjgsu.web;

import Entity.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zby on 2017/6/29.
 */
@Controller
@RequestMapping("/json")
public class BookController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/testRequestBody")
    @ResponseBody
    public Object getJson(){
        List<Book> list = new ArrayList<Book>();
        list.add(new Book(1,"Spring MVC企业实战","肖文吉"));
        list.add(new Book(2,"轻量级JavaEE企业应用实战","李刚"));
        return list;
    }
}
