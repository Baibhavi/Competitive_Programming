import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the number of test cases: ");
        int t = sc.nextInt();
        while(t-- > 0){
            //System.out.println("Enter the number of Characters: ");
            int n = sc.nextInt();
            char ch[] = sc.next().toCharArray();
            int q = 0, a = 0;
            for(int i = 0; i < n; i++){
                if(ch[i] == 'Q')
                    q++;
                else 
                    q= Math.max(0,q-1);
            }
            if(q==0){
                System.out.println("Yes ");
            }
            else{
                System.out.println("No ");
            }
        }
        sc.close();
    }
}