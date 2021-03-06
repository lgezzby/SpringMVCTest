package com.zjgsu.entity;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zby on 2017/6/30.
 */
public class Account implements Serializable{
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    @NumberFormat(style = NumberFormat.Style.NUMBER, pattern = "#,###")
    private int total;

    @NumberFormat(style = NumberFormat.Style.PERCENT)
    private double discount;

    @NumberFormat(style = NumberFormat.Style.CURRENCY)
    private double money;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "birthday=" + birthday +
                ", total=" + total +
                ", discount=" + discount +
                ", money=" + money +
                '}';
    }
}
