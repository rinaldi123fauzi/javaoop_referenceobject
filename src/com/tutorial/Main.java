package com.tutorial;

class Buku{
    String judul;
    String penulis;

    //constructor
    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    void display(){
        System.out.println("\nJudul\t:" + this.judul);
        System.out.println("\nPenulis\t:" + this.penulis);
    }
}

public class Main{
    public static void main(String[] args) {
        System.out.println("test");

        Buku buku1 = new Buku("Killing Commandantore","Haruki Murakami");

        buku1.display();

        //menampilkan address
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku1);

        //assignment object
        Buku buku2 = buku1;
        buku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressBuku2);


        //karena buku1 buku2 berada address atau reference yg sama
        buku1.judul = "Membunuh komandantur";
        buku1.display();
        buku2.display();

        //kita akan masukkan object kedalam methods
        fungsi(buku2);
        buku1.display();
        buku2.display();
    }
    public static void fungsi(Buku dataBuku){
        String addressBuku1 = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("address dalam fungsi : " + addressBuku1);
        dataBuku.penulis = "Haruki Mahalkami";
    }
}