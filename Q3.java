//Codeforces Contest 291 DIV2
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] n = sc.next().toCharArray();
        for(int i = 0; i < n.length; i++){
            if(n[i]>'4'){
                n[i] = (char)('9' - n[i] + '0');
            }
            if(n[0]=='0'){
                n[0]='9';
            }
        }
        System.out.println(n);
        System.out.println('9'-'2'+'0');
        sc.close();
    }
}
