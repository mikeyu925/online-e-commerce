package com.ywh.ec;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)  // 底层用Junit
@SpringBootTest(classes = {EcApplication.class}) // 启动整个SpringBoot工程
public class SpringTest {
    @Before
    public void testBefore(){
        System.out.println("测试 Before");
    }
    @Test
    public void test1(){
        System.out.println("测试1 Running");
        int a = 1;
        TestCase.assertEquals(1,a); // 断言 判断测试是否成功
    }
    @After
    public void testAfter(){
        System.out.println("测试 After");
    }
}
