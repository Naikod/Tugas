package firstmateri;

import java.util.Scanner;

/**
 *
 * @author moklet gaming 1
 */
public class fungsi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] DataNilai = {0, 0, 0, 0, 0};
        int X = 1;
        boolean ulang = true;
        while (ulang == true) {
            for (int i = 0; i < DataNilai.length; i++) {
                System.out.println("Inputkan 1-100 angka ke " + X + ": ");
                X++;
                DataNilai[i] = input.nextInt();
            }
            X = 1;
            for (int i = 0; i < DataNilai.length; i++) {
                if (DataNilai[i] <= 60) {
                    System.out.println("Angka ke " + X + ": " + DataNilai[i] + " NIILAI ANDA KURANG");
                } else if (DataNilai[i] <= 70) {
                    System.out.println("Angka ke " + X + ": " + DataNilai[i] + " NIILAI ANDA  CUKUP");
                } else if (DataNilai[i] <= 80) {
                    System.out.println("Angka ke " + X + ": " + DataNilai[i] + " NIILAI ANDA  CUKUP BAIK");
                } else if (DataNilai[i] <= 90) {
                    System.out.println("Angka ke " + X + ": " + DataNilai[i] + " NIILAI ANDA  BAIK");
                } else if (DataNilai[i] <= 100) {
                    System.out.println("Angka ke " + X + ": " + DataNilai[i] + " NIILAI ANDA  SEMPURNA");
                } else {
                    System.out.println("Angka ke " + X + ": " + DataNilai[i] + " Filter Tidak Ditemukan!");
                }
                X++;
            }
            System.out.println("apakah anda mau mengulang ?");
            String mengulang = input.next();
            if (mengulang.equalsIgnoreCase("n")) {
                ulang = false;
            }
        }
    }

}
