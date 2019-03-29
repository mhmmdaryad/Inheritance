package com.company;

 class overloading {
    String nama="kaki 4";
    int angka=0,umur=0;

    overloading(String a){
        nama=a;
    }
     overloading(String nm, int a){
        angka=a;
        nama=nm;
    }

     overloading(String nm, int a, int u){
        angka=a;
        nama=nm;
        umur=u;
    }


}
