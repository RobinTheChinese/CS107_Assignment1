import java.util.Scanner;

public class exercise4 {
    public static void main ( String [] args ){
        Scanner sc = new Scanner( System.in );
        int num = sc.nextInt();
        int  [] List = new int[num];
        for ( int i=1 ; i<=num ; i++){
            List[i-1] = sc.nextInt();
        }
        int A = 0;int B = 0;int C = 0;int D = 0;
        for ( int i=0 ; i<num ; i++ ){
            if( List[i]>=90 ){
                A++;
            } else if (List[i]>=80) {
                B++;
            } else if (List[i]>=70) {
                C++;
            } else if (List[i]>=60) {
                D++;
            }
        }
        System.out.printf("A: %d",A);
        System.out.println();
        System.out.printf("B: %d",B);
        System.out.println();
        System.out.printf("C: %d",C);
        System.out.println();
        System.out.printf("D: %d",D);
    }
}
