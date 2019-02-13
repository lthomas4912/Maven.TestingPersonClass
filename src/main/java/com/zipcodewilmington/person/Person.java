package com.zipcodewilmington.person;
import java.util.Scanner;

/**
 * Created by leon on 2/12/18.
 */
public class Person {



    private String name;
    private int age;
    private String gender;



    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.gender = "";
    }

    public Person(int age) {
        this.age = age;

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String myName, int myAge, String myGender) {
        name = myName;
        age = myAge;
        gender = myGender;


    }

    public void setName(String name) {
        this.name = name;

    }
    public void setGender(String gender) {
        this.gender = gender; }

    public void setAge(int age) {

        this.age = age;
    }



    public String getName() {

        return name;
    }

    public Integer getAge() {

        return age;
    }
    public String getGender(){
        return gender;}






}
