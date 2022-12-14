import java.util.Scanner;

public class GCD_OR_HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // 1 st Approach
        //-----------------------------------------------------------------------------------------------------------------
        int ans = 0;
        for(int i=2;i<a;i++){
            if(a%i == 0 && b%i ==0){
                ans = i;
            }
        }
        System.out.println("Approach 1- "+ans);

        // 2 nd Approach
        //------------------------------------------------------------------------------------------------------------------

        while(a%b != 0){
            int rem = a % b;
            a = b;
            b = rem;

        }
        System.out.println("Approach 2- "+b);
    }
}
