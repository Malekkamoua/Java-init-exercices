package com.tutorial.java.array_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneNumbers {

    public static void main(String[] args) {
        storeNumbers();
    }

    public static void storeNumbers() {

        ArrayList<Integer> phone = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Donner num");
            int number = scanner.nextInt();
            phone.add(number);

            System.out.println("Avez-vous un autre num? oui/non");
            String reponse = scanner.next();

            if(reponse.equals("non") == false && reponse.equals("oui") == false) {
                System.out.println("Reponse invalide");
                break;
            }

            if(reponse.equals("non")) {
                System.out.println("Merci, au revoir");
                System.out.println(phone);
                break;
            }
        }
    }
}
