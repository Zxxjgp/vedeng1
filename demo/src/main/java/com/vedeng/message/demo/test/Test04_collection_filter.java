package com.vedeng.message.demo.test;

import java.util.ArrayList;
import java.util.List;

public class Test04_collection_filter {

    //初始化集合的静态方法

   public static List<Person> createPerson(){
        List<Person> people = new ArrayList<Person>();
        Person person = new Person("张飞",Person.Sex.MALE,33,1.99);
        people.add(person);
        person = new Person("王菲",Person.Sex.FEMALE,3,1.65);
        people.add(person);
        person = new Person("刘亦菲",Person.Sex.FEMALE,343,1.68);
        people.add(person);
        person = new Person("李四",Person.Sex.MALE,343,1.76);
        people.add(person);
        person = new Person("小马",Person.Sex.MALE,343,1.71);
        people.add(person);
        person = new Person("郭靖",Person.Sex.MALE,33,1.88);
        people.add(person);
        return people;
    }
}
