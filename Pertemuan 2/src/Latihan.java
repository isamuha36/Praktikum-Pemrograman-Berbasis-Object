import java.util.Arrays;

public class Latihan {
    public static void main(String[] args) {
         int n = 5;
         int faktorial = 1;
         for (int i = 1; i <= n; i++) {
             faktorial *= i;
         }
         System.out.println(faktorial);



        String bakso = "bakSoo";
        Character[] baksoArray = new Character[bakso.length()];
        for (int i = 0; i < baksoArray.length; i++) {
            baksoArray[i] = bakso.charAt(i);
            System.out.print(baksoArray[i]);
        }
        System.out.println();

        String baksoBaru1 = "";
        for (int i = 0; i < baksoArray.length; i++) {
            baksoBaru1 = baksoBaru1.concat(baksoArray[i].toString());
        }
//        for (Character character : baksoArray) {
//            baksoBaru1 = baksoBaru1.concat(character.toString());
//        }
        System.out.println(baksoBaru1);

        String baksoBaru2= "";
        for (int i = 0; i < baksoArray.length; i++) {
            baksoBaru2 += baksoArray[i].toString();
        }
//        for (Character character : baksoArray) {
//            baksoBaru2 += character.toString();
//        }
        System.out.println(baksoBaru2);



        for (double i = 1; i < 20; i++) {
            System.out.println("Akar dari " + i + " adalah " + Math.sqrt(i));
            System.err.println("Error adalah "+ (i - (Math.sqrt(i)*Math.sqrt(i))));
        }


        
        int baris = 3;
        int kolom = 4;
        Integer[][] multiDeimensionalArray = new Integer[baris][kolom];
        int isi = 1;
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                multiDeimensionalArray[i][j] = isi;
                isi = isi + 1;
            }
        }
        System.out.println(Arrays.deepToString(multiDeimensionalArray));

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(multiDeimensionalArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
