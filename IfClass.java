/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KondisiIf;

/**
 *
 * @author Asus
 */
public class IfClass {
    public double TotBeli,potongan;
    
    public void setTotalBeli(Double a) {
        TotBeli=a;
    }
    public double getPotongan(){
        if (TotBeli >= 50000) {
            potongan = 0.2 * 50000;
        }
        return potongan;
        }
    public double JumlahBayar()
    {
        return (TotBeli-potongan);
    }
}
