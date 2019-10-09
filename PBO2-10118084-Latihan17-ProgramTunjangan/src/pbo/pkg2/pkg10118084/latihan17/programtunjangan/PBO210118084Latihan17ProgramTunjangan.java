/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg2.pkg10118084.latihan17.programtunjangan;
import java.util.Scanner;

/**
 *
 * @author
 * Nama  : Divi Adiffia Freza Alana
 * Kelas : PBO2
 * Nim   : 10118084
 * Deskripsi Program : Program ini berisi program untuk menghitung Tunjangan

 */
public class PBO210118084Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        Scanner Scanner = new Scanner (System.in);
        int gajipokok,totalgaji,Tunjangan;
        String status;
          
        System.out.println("==========Program Tunjangan==========");
    
        System.out.print("Berapa gaji pokok anda perbulan?: Rp.");       
        gajipokok = Scanner.nextInt();
        System.out.print("Status Anda? (Menikah/Belum)    : ");
        status = Scanner.next();
        if("Menikah".equals(status)) {
           Tunjangan=gajipokok*35/100;
       
        }
        else {
            Tunjangan = 0;
        }
        totalgaji = gajipokok + Tunjangan;
        System.out.println("Gaji Pokok  :"+gajipokok);
        System.out.println("Tunjangan   :"+Tunjangan);
        System.out.println("Total       :"+totalgaji);
        
    } 
    
}

