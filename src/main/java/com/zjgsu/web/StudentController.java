package com.zjgsu.web;

import Entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zby on 2017/6/29.
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping(value = "/checkForm", method = RequestMethod.GET)
    public String checkForm(Model model){
        Student student = new Student();
        List<String> list = new ArrayList<String>();
        list.add("JAVAEE");
        list.add("Spring");
        student.setCourses(list);

        List<String> courseList = new ArrayList<String>();
        courseList.add("JAVAEE");
        courseList.add("MyBatis");
        courseList.add("Spring");

        model.addAttribute("student",student);
        model.addAttribute("courseList",courseList);
        return "checkForm";
    }
}
