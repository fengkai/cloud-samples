package org.apache.dubbo.examples.provider.classloader.visibility;

/**
 * Test for class loader visibility.
 * Except: Parent class loader can not load child's class.
 */
public class Test {

    /**
     * Parent is AppClassLoader.
     * Child is MyClassLoader.
     * AppClassLoader can not load MyClassLoader's responsibility classes.
     */
    public static void main(String[] args) throws Exception{
        MyClassloader myClassloader = new MyClassloader();
        System.out.println(myClassloader.getParent());
        ClassLoader originalClassLoader  = Thread.currentThread().getContextClassLoader();
        try {
            Thread.currentThread().setContextClassLoader(myClassloader);
            // call some API that uses reflection without taking ClassLoader param
            Class<?> myPerson1 = Class.forName("MyPerson",false,myClassloader);
            //Delegate to parent(AppClassLoader), will fall back to MyClassLoader since AppClassLoader can not find MyPerson in class path.
//            Class<?> myPerson = myClassloader.loadClass("MyPerson");
//
//            Object o = myPerson.newInstance();
//
//            System.out.println(myPerson.getClassLoader());
//
//            System.out.println(o.getClass().getClassLoader());
        } finally {
            Thread.currentThread().setContextClassLoader(originalClassLoader);
        }



    }

}
