/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
/**
 *
 * @author Asus
 */
public class LatBuffered {
    public static void main(String args[]) throws Exception
    {
        //membuat objek baru
        InputStreamReader keyreader = new InputStreamReader (System.in);
        BufferedReader input = new BufferedReader (keyreader) ;
        //deklarasi variabel
        String kata1, kata2;
        
        System.out.print("Masukan kata pertama : ");
        kata1 = input.readLine();
        System.out.print("Masukan kata Kedua : ");
        kata2 = input.readLine();
        System.out.println("\nHasil Input String " + kata1 + " " + kata2);
    }
}
