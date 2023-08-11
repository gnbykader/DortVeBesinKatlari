import java.util.Iterator;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int n;
		Scanner inp = new Scanner(System.in);
		System.out.print("Sinir sayisini giriniz: ");
		n = inp.nextInt();
		
		for (int i = 1;i <=n; i*=4) {
			
			System.out.println("Dordun kati olan sayilar: "+i);
			
		}
		for (int j = 1; j <=n; j*=5) {
			System.out.println("Besin kati olan sayilar: "+j);
		}

	}

}
