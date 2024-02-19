import java.util.Scanner;

public class ELAB2312 {
	public static void main(String[] args) {
		Scanner banPhim = new Scanner(System.in);
		while(banPhim.hasNextLine()) {
			numberCharacter(banPhim);
		}
	}
	public static void numberCharacter (Scanner banPhim) {
		String line = banPhim.nextLine();
		int count = 0;
		for(char c : line.toCharArray()) {
			if(Character.isDigit(c)) {
				count++;
			}
		}
		System.out.println(count);
	}
}