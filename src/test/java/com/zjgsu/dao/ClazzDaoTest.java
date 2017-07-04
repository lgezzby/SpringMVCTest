package com.zjgsu.dao;

import com.zjgsu.po.Clazz;
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
public class ClazzDaoTest {
    @Autowired
    private ClazzDao clazzDao;

    @Test
    public void selectClazzById() throws Exception {
        Clazz clazz = clazzDao.selectClazzById(1);
        System.out.println(clazz);

        List<Student> students = clazz.getStudents();
        for (Student student : students){
            System.out.println(student);
        }
    }

}