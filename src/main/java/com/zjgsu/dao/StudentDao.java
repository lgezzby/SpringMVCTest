package com.zjgsu.dao;

import com.zjgsu.po.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zby on 2017/7/4.
 */
public interface StudentDao {
    Student selectStudentById(@Param("id") Integer id);
    List<Student> selectStudentByClazzId(@Param("id") Integer id);
}
