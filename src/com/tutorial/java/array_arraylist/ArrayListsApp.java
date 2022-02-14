package com.tutorial.java.array_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListsApp {

    public static void main(String [] args) {
        ArrayList<String> days = new ArrayList<>();

        days.add("Monday"); //0
        days.add("Tuesday"); //1
        days.add("Wednesday"); //2
        days.add("tuesday");
        System.out.println("Days: " + days);

        ArrayList<String> days_of_the_week = new ArrayList<>();
        days_of_the_week.add("Monday");
        days_of_the_week.add("Tuesday");
        days_of_the_week.add("Wednesday");

        days.remove(1);
        days.remove("Tuesday");

        //days.removeAll(days_of_the_week);
        System.out.println("ArrayList after removeAll(): " + days);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12); //0
        list.add(1); //1
        list.add(45); //2
        list.add(122); //3

        Collections.sort(list);
        //System.out.println("ArrayList after sort(): " + list);
        Collections.sort(list, Collections.reverseOrder());
        //System.out.println("ArrayList after sort(): " + list);

    }


}
