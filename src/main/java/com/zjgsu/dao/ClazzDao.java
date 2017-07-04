package com.zjgsu.dao;

import com.zjgsu.po.Clazz;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zby on 2017/7/4.
 */
public interface ClazzDao {
    Clazz selectClazzById(@Param("id") Integer id);
}
