package com.zjgsu.dao;

import com.zjgsu.po.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zby on 2017/7/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class StudentDaoTest {
    @Autowired
    private StudentDao studentDao;

    @Test
    public void selectStudentById() throws Exception {
        Student student = studentDao.selectStudentById(1);
        System.out.println(student);
    }

    @Test
    public void selectStudentByClazzId() throws Exception {
        List<Student> students = studentDao.selectStudentByClazzId(1);
        System.out.println(students);
    }

}