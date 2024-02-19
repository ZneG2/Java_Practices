import java.util.Scanner;
public class BASIC003 {
    public static void main(String[] args) {
        int n;
        Scanner banPhim = new Scanner(System.in);
        n = banPhim.nextInt();
        while(n > 0) {
            greetingFunc(banPhim);
            n--;
        }
    }
    
    public static void greetingFunc(Scanner banPhim){
        String name;
        name = banPhim.nextLine();
       	System.out.println("Hi " + name);
    }
}