package com.zjgsu.dao;

import com.zjgsu.po.Person;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zby on 2017/7/4.
 */
public interface PersonDao {
    Person selectPersonById(@Param("id") Integer id);
}
