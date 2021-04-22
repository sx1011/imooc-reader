package com.imooc.spring.ioc.bookshop.dao;

public class BookDaoImpl implements BookDao {
    public void insert() {
        System.out.println("向mysql插入一条数据");
    }
}
