/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tugas;
import java.util.*;
/**
 * @author IDW4N_nCounter
 * Be a nice guy.
 */
public class run {
    public static void main(String[] args) {
        // Deklarasi class
        customer c = new customer();
        kasir k = new kasir("Belena", 'L');
        laundry l = new laundry();
        
        // Deklarasi Variable
        Scanner in = new Scanner(System.in);
        int InputJenisLaundry, InputKilogram, TotalHarga=0;
        
        // Implement
        // --- Memasukkan Data Customer
        System.out.println("- Mohon diisi -");
        
        System.out.print("Masukkan Nama anda: ");
        c.setNamaCustomer(in.next()); // Input Nama
        
        System.out.print("Masukkan Alamat anda: ");
        c.setAlamat(in.next()); // Input Alamat
        
        System.out.print("Jenis Kelamin (L/W):");
        c.setJk(in.next().charAt(0)); // Input Jenis Kelamin
        
        System.out.print("Masukkan Saldo anda: ");
        c.setSaldo(in.nextInt()); // Input Saldo
        
        System.out.println("Terima Kasih Telah mengisi!\n\n");
        
        // --- Memasukkan Data Pembelian
        System.out.print("1. Kaos\t\t10.000/kg\n2. Celana\t\t8.000/kg\n=> ");
        InputJenisLaundry = in.nextInt();
        
        System.out.print("Total Kilogram:");
        InputKilogram = in.nextInt();
        if (InputJenisLaundry == 1)
        {
            TotalHarga = l.totalLaundry(InputKilogram, 10000);
        } 
        else if (InputJenisLaundry == 2)
        {
            TotalHarga = l.totalLaundry(InputKilogram, 8000);
        } 
        else { System.out.println("Jenis Laundry Tidak Ditemukan!"); }
        
        // --- Output Jumlah Harga DLL
        
        System.out.println("\n\n===================="
                + "\nKasir\t"+k.getNamaKasir()
                + "\n===================="
                + "\nPembeli\t"+c.getNamaCustomer()
                + "\nAlamat\t"+c.getAlamat()
                + "\nSaldo\t"+c.getSaldo()
                + "\n===================="
                + "\nJenis Laundry\t\t"+InputJenisLaundry
                + " - "+InputKilogram + " Kilogram"
                + "\nHarga /kg\t\t"+(TotalHarga/InputKilogram)
                + "\nTotal\t\t"+TotalHarga
                + "\nKembalian\t\t"+(c.getSaldo()-TotalHarga)
        );
        
        
        
    }
}
