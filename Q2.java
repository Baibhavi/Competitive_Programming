// Codeforces Contest 173 DIV2
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        while(n-->0){
            x += sc.next().contains("+")?1:-1;
        }
        System.out.println(x);
        sc.close();
    }
}
