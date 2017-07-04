package com.zjgsu.dao;

import com.zjgsu.po.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by zby on 2017/7/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring/spring-dao.xml")
public class PersonDaoTest {
    @Resource
    private PersonDao personDao;

    @Test
    public void selectPersonById() throws Exception {
        Person person = personDao.selectPersonById(1);
        System.out.println(person);
    }

}