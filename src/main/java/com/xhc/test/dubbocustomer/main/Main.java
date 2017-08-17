package com.xhc.test.dubbocustomer.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xhc.test.dubboclient.Product;
import com.xhc.test.dubboclient.service.IProductService;

public class Main {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("testdubbo-consumer.xml");

        IProductService services=(IProductService)context.getBean("productService");

        Product p1 = services.getByName("咖啡");

        System.out.println(p1);

        //Order.doOrder();
        System.in.read();
    }
}
