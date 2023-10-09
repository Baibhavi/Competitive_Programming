//codeforces context 898 div4 shortsort
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // String arr[][] = new String[3][t];
        while(t-- > 0){
            String s = sc.next();
            if(s.equals("bca") || s.equals("cab")){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
        while(t-- > 0){
            String s = sc.next();
            if(s.equals("abc") || s.equals("acb") || s.equals("bac") || s.equals("cba")){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        // sc.nextLine();
        // for(int i = 0; i<t;i++){
        //     String s = sc.nextLine();
        //     if(isSortable(s)){
        //         System.out.println("Yes");
        //     }
        //     else{
        //         System.out.println("No");
        //     }
        // }
        sc.close();
    }
//    public static boolean isSortable(String s){
//     if(s.charAt(1) == 'a')
//         return true;
//     if(s.charAt(0)=='b' || s.charAt(2) == 'b'){
//         return true;
//     } 
//     if(s.charAt(1) == 'c')
//         return true;
//     return false;       
//    }
    
}
