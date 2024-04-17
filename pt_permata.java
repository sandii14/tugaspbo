/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Asus
 */
public class pt_permata {
    public static void main(String[] args)throws IOException
    {
        InputStreamReader Keyreader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(Keyreader);
        
        int i,j;
        double total=0;
        String[]nama,petugas,kode, tanggal;
        int[]jumbel;
        double[]harga,tothar;
        nama = new String[11];
        petugas = new String[20];
        jumbel = new int[10];
        kode = new String[4];
        harga = new double[10];
        tothar = new double[10];
        tanggal = new String[10];
        
        System.out.println("\n                                           PT.PERMATA \"PRATAMA\"");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Nama Petugas    : "); petugas[0] = input.readLine();              
        System.out.print("Tanggal         : "); tanggal[0] = input.readLine();               
        System.out.print("\nJumlah Data Yang akan dimasukkan :"); j=Integer.parseInt(input.readLine());
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        for (i=1;i<=j;i++)
        {
        System.out.println("        Data Ke-                 : "+i);
        System.out.println("        Kode Barang              : "); kode[i]= input.readLine();
        System.out.println("        Jumlah                   : "); jumbel[i]= Integer.parseInt(input.readLine());
        System.out.println("    --------------------------------------------------------------------------------------------");
            if(kode[i].equalsIgnoreCase("P001")) {
                nama[i]= "Printer    ";
                harga[i]= 700000;
            }
            else if(kode[i].equalsIgnoreCase("V001")){
                nama[i]= "VGA Card   ";
                harga[i]= 75000;
            }
            else if(kode[i].equalsIgnoreCase("M001")){
                nama[i]= "Motherboard";
                harga[i]= 950000;
            }
            else {
                nama [i] = "Kode Tidak Tersedia";
                harga [i] = 0;
            }
            tothar[i]=harga[i]*jumbel[i];
            total=total+tothar[i];
        }
        
        System.out.println("\n                                         PT.PERMATA \"PRATAMA\"");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Nama Petugas                : " + petugas[0] + "\t\t Tanggal : " + tanggal[0]);
        System.out.println("Jumlah Data yang di masukan :" + j );
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Data Ke \tKode Barang \tNama Barang \t\tHarga Barang \tJumlah Barang \t\tTotal Harga");
        System.out.println("\n--------------------------------------------------------------------------------------------------------");
        for(i=1;i<=j;i++) {
        System.out.println(i+"\t\t"+kode[i]+"\t\t"+nama[i]+"\t\t"+harga[i]+"\t\t"+jumbel[i]+"\t\t"+tothar[i]);
        }
        System.out.println("\n--------------------------------------------------------------------------------------------------------");
        System.out.println("Total Pendapatan Pada tanggal" +tanggal[0] + "adalah sebesar Rp." +total);
        
        
    }

}
