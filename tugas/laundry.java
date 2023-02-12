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
public class laundry {

    private String JenisLaundry;
    
    private int harga;

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getJenisLaundry() {
        return JenisLaundry;
    }

    public void setJenisLaundry(String JenisLaundry) {
        this.JenisLaundry = JenisLaundry;
    }
    public int totalLaundry(int kilo, int harga){
        return kilo * harga;
    }

}
