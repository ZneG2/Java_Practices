import java.util.Scanner;

public class BASIC005 {
	public static void main(String[] args) {
		int t;
		Scanner banPhim = new Scanner(System.in);
		t = banPhim.nextInt();
		while(t > 0) {
			sumOfArray(banPhim);
			t--;
		}
	}
	public static void sumOfArray(Scanner banPhim) {
		int[] arr = new int[100];
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			arr[i] = banPhim.nextInt();
			sum += arr[i];
		}
		System.out.println(sum);
	}
}