package com.imooc.spring.ioc.bookshop.service;


import com.imooc.spring.ioc.bookshop.dao.BookDao;

public class BookService {
    private BookDao bookDao;
    // 采购方法。
    // 新增数据，当然要通过dao完成数据的插入.此时作为ioc容器可以通过set方法进行动态注入
    public void purchase() {
        System.out.println("正在执行图书采购业务方法");
        bookDao.insert();
    }

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
