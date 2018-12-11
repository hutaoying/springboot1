package com.springboot_aop.aop.concert.impl;

import com.springboot_aop.aop.concert.Performance;
import org.springframework.stereotype.Service;

@Service
public class PerformanceImpl implements Performance {
    @Override
    public void perform() {
        System.out.println("perform  start");
    }
}
