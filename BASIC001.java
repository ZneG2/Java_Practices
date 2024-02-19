import java.util.Scanner;

public class BASIC001 {
	public static void main(String[] args) {
		int n;
		Scanner banPhim = new Scanner(System.in);
		n = banPhim.nextInt();
		banPhim.nextLine();
		while(n > 0) {
			printString(banPhim);
			n--;
		}
	}
	
	public static void printString(Scanner banPhim) {
		String s = banPhim.nextLine();
		System.out.println(s);
	}
}