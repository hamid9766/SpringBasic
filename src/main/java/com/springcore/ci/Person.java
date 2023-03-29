package com.springcore.ci;

import java.util.List;

public class Person {
    private String name;
    private int personId;
    private List<String> list;


    public Person(String name, int personId, List<String> list) {
        this.name = name;
        this.personId = personId;
        this.list = list;
    }

    @Override
    public String toString() {
        return this.name + " : " + this.personId + " : " +this.list;
    }
}
