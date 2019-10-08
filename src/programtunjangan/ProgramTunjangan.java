/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programtunjangan;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA		: Dandi Muhammad Iqbal
 * KELAS	: PBO11K
 * NIM		: 10118911
 * 
 */
public class ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double gaji,tunjangan,total_gaji = 0;        
        System.out.println("=========Program Tunjangan========");
        System.out.print("Berapa gaji pokok anda perbulan ?\t: Rp. ");        
        gaji = input.nextDouble();        
        System.out.print("Status anda ? (Menikah/Belum)   : ");
        String status = input.next();        
        if (status.equals("Menikah"))
            tunjangan = gaji*35/100;
        else 
            tunjangan = 0;        
        total_gaji = gaji+tunjangan;
        System.out.println("\n======Hasil Perhitungan Gaji Anda======");
        System.out.println("Gaji Pokok\t\t: Rp "+gaji);
        System.out.println("Tunjangan\t\t: Rp "+tunjangan);
        System.out.println("Total Gaji\t\t: Rp "+total_gaji);
        System.out.println("(Developed by : Dandi M Iqbal)");
        
    }
    
}
