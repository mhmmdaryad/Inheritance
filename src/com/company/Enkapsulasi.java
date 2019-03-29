package com.company;

public class Enkapsulasi extends hewan{

    private String ab;
    private int bc;
    private int cd;

    Enkapsulasi() {
        System.out.println("Nama hewan\t= " + super.hewan1);
        System.out.println("Jumlah kaki\t= " + super.kaki);
        System.out.println("Umur\t= " + super.umur);
    }
}
