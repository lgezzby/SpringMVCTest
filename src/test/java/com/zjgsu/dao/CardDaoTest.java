package com.zjgsu.dao;

import com.zjgsu.po.Card;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by zby on 2017/7/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring/spring-dao.xml")
public class CardDaoTest {
    @Resource CardDao cardDao;

    @Test
    public void selectCardById() throws Exception {
        Card card = cardDao.selectCardById(1);
        System.out.println(card);
    }

}