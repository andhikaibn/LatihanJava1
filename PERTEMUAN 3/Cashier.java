/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author ANDIKA
 */
public class Cashier {
     public static void main(String[] args) {
        String nama_barang;
        int jumlah_barang, harga;
        double totalharga, diskon = 0.075, totalbayar;

        Scanner input = new Scanner(System.in);

        System.out.println("Program kasir Toko Baju");
        System.out.println("-----------------------");
        System.out.println("Masukan data berikut");
        System.out.println("Nama Barang : ");
        nama_barang = input.nextLine();
        System.out.println("Jumlah Barang : ");
        jumlah_barang = input.nextInt();
        System.out.println("Harga Barang : ");
        harga = input.nextInt();

        if (harga<100) {
            System.out.println("Mohon masukan harga yang valid dan ulang programnya");
            System.exit(0);
        }

        System.out.println("Anda mendapatkan diskon 7,5%");
        totalharga = jumlah_barang * harga;
        System.out.println("Total Harga="+totalharga);
        diskon = totalharga * diskon;
        totalbayar = totalharga - diskon;
        System.out.println("Total Bayar ="+totalbayar);
    }
}
