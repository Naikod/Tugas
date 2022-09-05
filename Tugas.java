package firstmateri;
import java.util.*;
public class Tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Loket Pembelian Tiket");
        System.out.print("Masukkan suhu tubuh: ");
        float suhu = input.nextFloat();
        if (suhu>=36.0){
            System.out.println("Anda termasuk golongan hijau (safe)!");
            System.out.print("Masukkan jumlah tiket yang akan di beli: ");
            int jumlah = input.nextInt();
            int total = 15000*jumlah;
            System.out.println("Anda membeli "+jumlah+" Tiket.\nTotal yang harus di bayar ~> Rp."+total);
            System.out.print("Masukkan jumlah uang anda: ");
            int uang = input.nextInt();
            if (uang>=total) {
                System.out.println("Rp. "+total+"\nRp. "+uang+"\n============= -\n\nKembalian > Rp. "+(uang-total));
            } else {
                System.out.println("Mohon maaf, uang anda kurang.");
            }
        } else {
            System.out.println("Mohon maaf, anda tidak boleh masuk!");
        }
    }
}
