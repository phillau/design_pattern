package com.liufei.chapter1.template.otherExample;

import java.util.Arrays;

public class Duck implements Comparable<Duck> {
    public static void main(String[] args) {
        Duck duck1 = new Duck(1, 4);
        Duck duck2 = new Duck(5, 5);
        Duck duck3 = new Duck(3, 7);
        Duck duck4 = new Duck(2, 1);
        Duck duck5 = new Duck(6, 3);
        Duck[] ducks = {duck1,duck2,duck3,duck4,duck5};
        display(ducks);
        System.out.println("--------------------------");
        Arrays.sort(ducks);
        display(ducks);
    }

    private int age;
    private int weight;

    public Duck(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    @Override
    public int compareTo(Duck duck) {
        if(this.age>duck.age){
            return 1;
        }else if(this.age<duck.age){
            return -1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Duck{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }

    public static void display(Duck[] ducks){
        for (Duck duck : ducks) {
            System.out.println(duck.toString());
        }
    }
}
