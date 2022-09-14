package tugas;
import java.util.Scanner;
public class Tugas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String jalur, golongan;

        System.out.println("Jalur yang tersedia :\n1. SNMPTN\n2. SBMPTN\n3. MANDIRI\n> ");
        jalur = input.next();

        if (jalur.equalsIgnoreCase("SNMPTN")) {
            System.out.println("Golongan Pendapatan yang tersedia: \n>  A \n> B \n> C");
            golongan = input.next();
            if (golongan.equalsIgnoreCase("A")) {
                System.out.println("DSP = 5 JUTA");
                System.out.println("SPP = 500 RIBU");
            } else if (golongan.equalsIgnoreCase("B")) {
                System.out.println("DSP = 15 JUTA");
                System.out.println("SPP = 1 JUTA");
            } else if (golongan.equalsIgnoreCase("C")) {
                System.out.println("DSP = 30 JUTA");
                System.out.println("SPP = 2 JUTA");
            } else {
                System.out.println("Golongan Pendapatan "+golongan+" tidak tersedia");
            }

        } else if (jalur.equalsIgnoreCase("SBMPTN")) {
            System.out.println("Golongan Pendapatan yang tersedia: \n>  A \n> B \n> C");
            golongan = input.next();
            if (golongan.equalsIgnoreCase("a")) {
                System.out.println("DSP = 5 JUTA");
                System.out.println("SPP = 500 RIBU");
            } else if (golongan.equalsIgnoreCase("b")) {
                System.out.println("DSP = 15 JUTA");
                System.out.println("SPP = 1 JUTA");
            } else if (golongan.equalsIgnoreCase("c")) {
                System.out.println("DSP = 30 JUTA");
                System.out.println("SSP = 2 JUTA");
            } else {
                System.out.println("Golongan Pendapatan "+golongan+" tidak tersedia");
            }
        } else if (jalur.equalsIgnoreCase("MANDIRI")) {
            System.out.println("Golongan Pendapatan yang tersedia: \n>  A \n> B \n> C");
            golongan = input.next();
            if (golongan.equalsIgnoreCase("a")) {
                System.out.println("DSP: 10 JUTA\nSPP: 1 JUTA");
            } else if (golongan.equalsIgnoreCase("b")) {
                System.out.println("DSP: 25 JUTA\nSPP: 2 JUTA");
            } else if (golongan.equalsIgnoreCase("c")) {
                System.out.println("DSP: 50 JUTA\nSPP: 3 JUTA");
            } else {
                System.out.println("Golongan Pendapatan "+golongan+" tidak tersedia");
            }
        } else {
            System.out.println("Jalur "+jalur+" tidak ditemukan");
        }

    }

}
