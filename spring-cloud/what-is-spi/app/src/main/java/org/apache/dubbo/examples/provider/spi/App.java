package org.apache.dubbo.examples.provider.spi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Iterator;
import java.util.ServiceLoader;

public class App {

    public static void main(String[] args) throws Exception{
//        ServiceLoader<DemoService> demoServices = ServiceLoader.load(DemoService.class);
//        Iterator<DemoService> iterator = demoServices.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next().getClass().getName());
//            System.out.println(iterator.next().getClass().getClassLoader());
////            System.out.printf(iterator.next().sayHello());
//        }

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nacos?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC", "root", "sa123");
        System.out.println(connection.getAutoCommit());


    }
}
