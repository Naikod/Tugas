package firstmateri;

import java.util.Scanner;

public class fungsi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float berat, tinggi, bmi;
        System.out.println("BMI Calculator");
        System.out.print("Masukkan berat badan anda [kg]: ");
        berat = in.nextFloat();
        System.out.print("Masukkan tinggi badan anda [cm]: ");
        tinggi = in.nextFloat();
        System.out.println();
        bmi = berat / ((tinggi / 100) * (tinggi / 100));
        System.out.println("BMI anda:" + bmi);
        if (bmi < 18.5) {
            System.out.println("Berat Badan anda kurang. (dibawah 18.5)");
        } else if (bmi <= 24.9) {
            System.out.println("Berat badan anda normal (18.5-24.9)");
        } else if (bmi < 24.9) {
            System.out.println("Anda kelebihan berat badan (melebihi 25-29.9)");
        } else {
            System.out.println("Anda melebihi berat badan (lebih dari 30)");
        }
    }
}
