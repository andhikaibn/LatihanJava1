/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latbuffered;
import java.io.*;
/**
 *
 * @author ANDIKA
 */
public class LatBuffered {
    public static void main(String[] args)throws Exception 
{
//membuat objek baru
InputStreamReader keyreader = new InputStreamReader(System.in);
BufferedReader input = new BufferedReader(keyreader);
//deklarasi variable
String kata1, kata2;

System.out.print("Masukkan Kata Pertama : ");
kata1 = input.readLine();
System.out.print("Masukkan Kata Kdeua : ");
kata2 = input.readLine();
System.out.println("\nHasil Input String : " + kata1 + " " + kata2);

    }
}
