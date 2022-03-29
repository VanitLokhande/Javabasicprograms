import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int flag = 0;
        if(n==1 || n==0){
            System.out.print("It is not Primeno");
        }
        else {
            for(int i=2;i<n;i++) {
                if (i % n == 0) {
                    System.out.print("It is not Primeno");
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                System.out.print("It is Primeno");
        }

        }

    }
}
