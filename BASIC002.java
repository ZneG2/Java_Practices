import java.util.Scanner;

public class BASIC002 {
	public static void main(String[] args) {
		int n;
		Scanner banPhim = new Scanner(System.in);
		n = banPhim.nextInt();
		banPhim.nextLine();
		while(n > 0) {
			printScreen(banPhim);
			n--;
		}
	}
	
	public static void printScreen(Scanner banPhim) {
		String s = banPhim.nextLine();
		System.out.println(s);
	}
}
