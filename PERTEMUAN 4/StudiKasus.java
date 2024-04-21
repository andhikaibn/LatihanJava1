/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studikasus;
import java.util.Scanner;

/**
 *
 * @author ANDIKA
 */
public class StudiKasus {

    public static void main(String[] args) {
        String nama, tanggal;
        int data,i, k;
        String [] code, namaBarang;
        int [] jumlah;
        
        String[] namabarang = {"Printer","VGA Card","MotherBoard"};
        String[] codebarang = {"P001", "V001","M001"};
        int[] hargabarang = {700000, 75000, 950000};
        System.out.println("-----------------------------------------");
        System.out.println("Kode Barang   Nama Barang    Harga Barang");
        for (i=0; i<3; i++){
        System.out.println(codebarang[i] + namabarang[i] + hargabarang[i]);
        }
        System.out.println("-----------------------------------------");
        Scanner input = new Scanner (System.in);
        System.out.println("\n        PT.PERMATA \"PRATAMA\"");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Nama Petugas  : ");
        nama = input.nextLine();
        System.out.print("Tanggal       : ");
        tanggal = input.nextLine();
        System.out.println("\n");
        System.out.print("Jumlah Data  : ");
        data = input.nextInt();
        
        code = new String[data];
        jumlah = new int[data];
        
        int[] hargaBarang, totalHarga;
        
        namaBarang = new String[data];
        hargaBarang = new int[data];
        totalHarga = new int[data];
        
        System.out.println("-------------------------------------------");
        for (i=0; i<data; i++){
        int t = 0;
        k = i + 1;
        System.out.println("Data Ke-"+k);
        System.out.print("Kode barang : ");
        code[i] = input.next();
        switch(code[i]){
        case "P001":
        hargaBarang[i] = 700000;
        namaBarang[i] = " Printer   ";
        break;
        case "V001":
        hargaBarang[i] = 75000 ;
        namaBarang[i] = "VGA Card   ";
        break;
        case "M001":
        hargaBarang[i] = 950000;
        namaBarang[i] = "MotherBoard";
        break;
        default:
        System.out.println("Kode tidak ada!");
        t = 1;
        break;
        }
            if (t==1){
                t=0;
                i -= 1;
                continue;
            }
            System.out.print("Jummlah     : ");
            jumlah[i] = input.nextInt();
            totalHarga[i] = hargaBarang[i]*jumlah[i];
            System.out.println("--------------------------------------");            
        }
        System.out.println("\n\n");
        System.out.println("                              PT.PERMATA 'PRATAMA'                                     ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Nama Petugas                 : "+nama+"                   Tanggal  : "+tanggal);
        System.out.println("Jummlah Data yang di masukan : "+data);
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Data Ke    Kode Barang    Nama Barang    Harga Barang    Jumlah Barang    Total Barang");
        
        System.out.println("---------------------------------------------------------------------------------------");
        for (i=0; i<data; i++){
            k = i + 1;
        System.out.println(" "+k+"          "+code[i]+"             "+namaBarang[i]+"      "+hargaBarang[i]+"           "+jumlah[i]+"           "+totalHarga[i]);    
        }
        
    }
}
