import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Character[] charArray = new Character[]{'I', 'S', 'A'};
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
          }
        
        System.out.println(charArray);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(4);
        numbers.add(10);
        System.out.println(numbers);
        numbers.remove(0);
        System.out.println(numbers);
        System.out.println(numbers.get(0));
        System.out.println(numbers.size());
        numbers.remove(Integer.valueOf(10)); // INI LANGSUNG MENGHAPUS ISI BUKAN INDEX
        System.out.println(numbers);





        // // ArrayList<String> students = new ArrayList<String>();
        // // students.add("Isa");
        // // students.remove("Isa");
        // // System.out.println(students.size());
        // // students.add("Aziz");
        // // students.add("Nino");
        // // students.remove(0);
        // // System.out.println(students.get(0));
        // // students.add("Reza");
        // // students.add("Arga");
        // // students.add("Dwi");
        // // students.add("Damar");
        // // System.out.println(students.size());
        // // System.out.println(students);
        // // for (int i = 0; i < students.size(); i++) {
        // //     System.out.println(students.get(i));
        // // }


        // Integer[] angkaArray = new Integer[]{2,4,6,8,10};
        // for (int i = 0; i < angkaArray.length; i++) {
        //     System.out.println(angkaArray[i]);
        // }

        // // int i = 0;
        // // while (i < angkaArray.length) {
        // //     System.out.println(angkaArray[i]);
        // //     i++;
        // // }

        // int i = 0;
        // do {
        //     System.out.println(angkaArray[i]);
        //     i++;
        // } while (i < angkaArray.length);

        // Integer[] nomorArray = new Integer[5];
        // for (int k = 0; k < 5; k++) {
        //     int z = k;
        //     nomorArray[k] = z+2;
        // }
        
        // for (int l = 0; l < nomorArray.length; l++) {
        //     System.out.print(nomorArray[l]+ " ");
        // }

        // int soal = 5;
        // int hasil = 1;
        // for(int q = 5; q < 1; q--) {
        //     soal += hasil*q;
        //     System.out.println(soal);
        // }
        
    }
}
