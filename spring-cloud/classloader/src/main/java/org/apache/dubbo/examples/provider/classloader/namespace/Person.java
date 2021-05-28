package org.apache.dubbo.examples.provider.classloader.namespace;

public class Person {

    private Person person;

    public void setPerson(Object person){
        this.person = (Person) person;
    }


}
