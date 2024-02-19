import java.math.BigInteger;
import java.util.Scanner;

public class LAB01_BigInt {
	public static void main (String[] args) {
		int n;
		Scanner banPhim = new Scanner(System.in);
		n = banPhim.nextInt();
		banPhim.nextLine();
		while(n > 0) {
			bigIntegerResult(banPhim);
			n--;
		}
	}
	public static void bigIntegerResult(Scanner banPhim) {
		String line = banPhim.nextLine();
		String[] parts = line.split(" ");
		BigInteger A = new BigInteger(parts[0]);
		BigInteger B = new BigInteger(parts[2]);
		String operator = parts[1];
		switch (operator) {
			case "-":
				System.out.println(A.subtract(B));
				break;
			case "+":
				System.out.println(A.add(B));
				break;
			case "/":
				System.out.println(A.divide(B));
				break;
			case "*":
				System.out.println(A.multiply(B));
				break;
		}
	}
}