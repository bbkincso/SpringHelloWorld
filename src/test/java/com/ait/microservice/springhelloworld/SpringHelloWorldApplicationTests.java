package com.ait.microservice.springhelloworld;


import org.junit.Assert;
import org.junit.Before;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Test;




@SpringBootTest
class SpringHelloWorldApplicationTests {

    HelloService helloService;

    @Before
    public void setUp() throws Exception {
        helloService = new HelloService();
    }


    @Test
    public void test() {
        Assert.assertEquals("Hello World 2022...", helloService.index());
    }

}
