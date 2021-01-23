package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Kreiramo listu za memorisanje gradova C
        ArrayList<String> cityList = new ArrayList<String>();
        // Dodavanje nekih gradova u listu
        cityList.add("London");
        cityList.add("Los Angeles");
        cityList.add("Berlin");
        cityList.add("Maiami");
        cityList.add("Paris");
        cityList.add("Seul");
        cityList.add("Tokyo");
        System.out.println("List size: " + cityList.size());
        System.out.println("Is Maiami in the list?");
        cityList.contains("Maiami");
        System.out.println("The location of Denver in the list " + cityList.indexOf("Denver"));
        System.out.println("Is the list is empty? " + cityList.isEmpty());
        // Ubaciti novi grad u listu
        cityList.add("Bejiing");
        // uklanjanje grada iz liste
        cityList.remove("Denver");
        // Ukloniti grad na indeksu 2
        cityList.remove(2);

        // Prikazuje sadrzaj liste
        System.out.println(cityList.toString());

        // Prikazuje sadrzaj u obnutom redosledu
        for(int i =cityList.size()-1; i>=0;i--){
            System.out.println(cityList.get(i)+ " ");
            System.out.println();
        }
        System.out.println(cityList.toString());


    }
}
