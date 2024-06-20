package org.example.GroupeA10Exercice1;

import org.example.GroupeA10Exercice1.Singleton;

public class Main {
    public static void main(String[] args) {


        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("évaluer  l'expression ");
        // évaluer expression s1 == s2
    }
}