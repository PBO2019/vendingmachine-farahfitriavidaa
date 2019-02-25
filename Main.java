package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> kopi   = new ArrayList<>();
        ArrayList<String> topping  = new ArrayList<>();
        MesinKopi arabica = new MesinKopi();
        arabica.setJenisKopi("Arabica");
        arabica.setJumlahStokKopi(40);
        arabica.setTopping("susu");
        kopi.add(arabica.getJenisKopi());
        topping.add(arabica.getTopping());
        MesinKopi robusta = new MesinKopi();
        robusta.setJenisKopi("Robusta");
        robusta.setJumlahStokKopi(40);
        robusta.setTopping("gula");
        kopi.add(robusta.getJenisKopi());
        topping.add(robusta.getTopping());
        MesinKopi flores = new MesinKopi();
        flores.setJenisKopi("Flores");
        flores.setJumlahStokKopi(40);
        flores.setTopping("cream");
        kopi.add(flores.getJenisKopi());
        topping.add(flores.getTopping());

        System.out.println(" -- Menu kopi --");
        for(int i=0; i< kopi.size();i++){
            int j= i+1;
            System.out.println(j+". "+kopi.get(i));
        }

        System.out.println("-----------------------");

        System.out.println(" -- Menu topping --");
        for(int i=0; i< topping.size();i++){
            int j= i+1;
            System.out.println(j+". "+topping.get(i));
        }


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukan kopi yang mau dipilih : ");
        int pilihanKopi = keyboard.nextInt() -1;
        System.out.println("Masukan topping yang diinginkan : ");
        int pilihanTopping = keyboard.nextInt() -1;

        System.out.println("Pesanan anda adalah kopi " + kopi.get(pilihanKopi) + " dengan topping " + topping.get(pilihanTopping));
    }
}
