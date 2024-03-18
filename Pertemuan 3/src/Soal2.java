import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan Ukuran Area");
        int intInput = scanner.nextInt();

        System.out.println("Masukan titik start X");
        int intStartX = scanner.nextInt();

        System.out.println("Masukan titik start y");
        int intStartY = scanner.nextInt();

        System.out.println("Masukan titik finish X");
        int intFinishX = scanner.nextInt();

        System.out.println("Masukan titik finish Y");
        int intFinishY = scanner.nextInt();

        System.out.println("Start = " + intStartX + ", " + intStartY);
        System.out.println("Finish = " + intFinishX + ", " + intFinishY);

        for (int i = 0; i < intInput; i++) {
            for (int j = 0; j < intInput; j++) {
                if (i == intStartY && j == intStartX) {
                    System.out.print("S | ");
                } else if (i == intFinishY && j == intFinishX) {
                    System.out.print("F | ");
                } else {
                    System.out.print("x | ");
                }
            }
            System.out.println();
        }


        while (intStartX < intFinishX){
            intStartX++;
            System.out.println("posisi robot sekarang ada di titik "+intStartX+", "+intStartY);
        }
        while (intStartX > intFinishX){
            intStartX--;
            System.out.println("posisi robot sekarang ada di titik "+intStartX+", "+intStartY);
        }
        while (intStartY < intFinishY){
            intStartY++;
            System.out.println("posisi robot sekarang ada di titik "+intStartX+", "+intStartY);
        } while (intStartY > intFinishY){
            intStartY--;
            System.out.println("posisi robot sekarang ada di titik "+intStartX+", "+intStartY);
        }
    }
}

