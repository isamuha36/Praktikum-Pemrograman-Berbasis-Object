import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String inputString = scanner.nextLine();

        System.out.print("Masukkan usia: ");
        int inputInt = scanner.nextInt();

        System.out.print("Masukkan IPK: ");
        double inputDouble = scanner.nextDouble();

        System.out.print("Masukan Status Menikah: ");
        boolean inputBoolean = scanner.nextBoolean();

        System.out.println("Nama: " + inputString);

        if (inputInt <= 10){
            System.out.println("yhahaha bocil");
        } else if (inputInt > 10 && inputInt < 21) {
            System.out.println("weh kita seumuran");
        } else if (inputInt > 20) {
            System.out.println("puh sepuh ajarin dong puh");
        } else {
            System.out.println("fix alien ini mah");
        }

        System.out.println("IPK: " + inputDouble);

        if (inputBoolean) {
            System.out.println(inputString+" Sudah Menikah");
        } else {
            System.out.println(inputString+" Belum Menikah");
        }

        scanner.close();


    }
}
