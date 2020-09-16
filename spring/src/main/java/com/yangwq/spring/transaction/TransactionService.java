package com.yangwq.spring.transaction;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public class TransactionService {

    @Transactional(rollbackFor = Throwable.class)
    public void testTransaction(){
        System.out.println("方法逻辑");
    }
}
