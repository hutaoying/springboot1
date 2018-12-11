package com.springboot_aop.aop;


import com.springboot_aop.aop.concert.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PerformTest {
    @Autowired
    private Performance performanceImpl;
    @Test
    public void test1() {
        performanceImpl.perform();
    }
}
