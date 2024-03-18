import java.util.Scanner;
import java.util.Arrays;
public class cek {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Masukkan ukuran area");
		int ukuran = scan.nextInt();
		
		System.out.println("Masukkan titik start X");
		int startx = scan.nextInt();
		
		System.out.println("Masukkan titik start Y");
		int starty = scan.nextInt();
		
		System.out.println("Masukkan titik finish X");
		int finishx = scan.nextInt();
		
		System.out.println("Masukkan titik finish Y");
		int finishy = scan.nextInt();
		
		System.out.println("");
		System.out.println("Start = " + startx +", "+ starty);
		System.out.println("Finish = " + finishx +", "+ finishy);
// 		char arrayy [][]= new char[ukuran][ukuran];
		for (int y=0; y<ukuran; y++){
		    for (int x=0; x<ukuran; x++){
		        if (x == startx && y==starty){
		            System.out.print(" S |");
		          //  arrayy[x][y]='S';
		        }
		        else if (x==finishx && y==finishy){
		            System.out.print(" F |");
		          //  arrayy[x][y]='F';
		        }
		        else{
		            System.out.print(" x |");
		          //  arrayy[x][y] = 'x';
		        }
		    }
		    System.out.println("");
		}
		
// 		System.out.println(Arrays.deepToString(arrayy));
		System.out.println("");
		System.out.println("Jalan");
		for (int x=(startx+1); x<=finishx; x++){
		    System.out.println("Posisi robot sekarang ada di titik : " + x + ", " + starty);
		}
		for (int y=(starty+1); y<=finishy; y++){
		    System.out.println("Posisi robot sekarang ada di titik : " + finishx + ", " + y);
		}
		for (int x=(startx-1); x>=finishx; x--){
		    System.out.println("Posisi robot sekarang ada di titik : " + x + ", " + starty);
		}
		for (int y=(starty-1); y>=finishy; y--){
		    System.out.println("Posisi robot sekarang ada di titik : " + finishx + ", " + y);
		}
	}
}
