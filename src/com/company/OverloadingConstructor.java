package com.company; 

import java.util.Scanner;

public class OverloadingConstructor {

    public static void main(String[] args) {
        int a,u;
        String nm = null;


        Scanner s= new Scanner(System.in);

        System.out.println("Masukkan Nama : ");
        nm=s.nextLine();
        overloading nama=new overloading(nm);

        System.out.println("Masukkan Kaki : ");
        a=Integer.parseInt(s.nextLine());

        overloading angka=new overloading(nm,a);

        System.out.println("Masukkan umur : ");
        u=Integer.parseInt(s.nextLine());
        overloading umur=new overloading(nm,a,u);

        Enkapsulasi kapsul=new Enkapsulasi();

        System.out.println("\nConstructor 1");

        System.out.println("\nConstructor 2");
        kapsul();

        System.out.println("\nConstructor 3");
        kapsul();


    }

}
