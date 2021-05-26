package com.example.classloader.namespace;

import java.lang.reflect.Method;

/**
 * Namespace test for different class loader.
 * Except: Person will not be cast to Person.
 *
 * @author Tyler Feng
 */
public class Test {

    public static void main(String[] args) throws Exception{
        MyClassloader myClassloader1 = new MyClassloader();
        MyClassloader myClassloader2 = new MyClassloader();

        Class<?> aClass1 = myClassloader1.loadClass("com.example.classloader.namespace.Person");
        Class<?> aClass2 = myClassloader2.loadClass("com.example.classloader.namespace.Person");

        Object o1 = aClass1.newInstance();
        Object o2 = aClass2.newInstance();

        System.out.println(o1.getClass().getClassLoader());
        System.out.println(o2.getClass().getClassLoader());

        Method setPerson = aClass1.getMethod("setPerson", Object.class);
        setPerson.invoke(o1,o2);

        com.example.classloader.namespace.Person person = new com.example.classloader.namespace.Person();

    }
}
