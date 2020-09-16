package com.yangwq.spring.transaction;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionServiceTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        TransactionService transactionService = context.getBean(TransactionService.class);
        transactionService.testTransaction();
    }
}
