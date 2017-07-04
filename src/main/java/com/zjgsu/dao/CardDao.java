package com.zjgsu.dao;

import com.zjgsu.po.Card;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zby on 2017/7/4.
 */
public interface CardDao {
    Card selectCardById(@Param("id") Integer id);
}
