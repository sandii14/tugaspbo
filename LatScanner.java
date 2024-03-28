/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class LatScanner {
    public static void main(String args[]){
        //membyat objek baru
        Scanner input = new Scanner(System.in);
        //deklarasi variable
        String nama;
        int n2;
        double n1, n3;
        
        System.out.print("Masukan Nama Anda : ");
        nama = input.nextLine ();
        System.out.print("Masukan Nilai 1 : ");
        n1 = input.nextDouble ();
        System.out.print("Masukan Nilai 2 : ");
        n2 = input.nextInt ();
        
        n3 = n1 + n2;
        System.out.println("\nNama Anda : " + nama);
        
        System.out.println("Nilai Anda : " + n3);
    }
}
