import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukan size array: ");
        int inputInt = scanner.nextInt();

        int[] intArray = new int[inputInt];
        System.out.println("Masukan element array:");
        for (int i = 0; i < inputInt; i++) {
            System.out.print("Element " + (i+1) + ": ");
            intArray[i] = scanner.nextInt();
        }

        System.out.print("Final array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            if (i < intArray.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();

        int cek = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > cek) {
                cek = intArray[i];
            }
        }
        System.out.println("Angka terbesar: "+ cek);
    }
}
