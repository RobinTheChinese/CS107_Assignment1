import java.util.Scanner;

public class exercise2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<=num-1;i++){
            double x1 = sc.nextFloat();
            double y1 = sc.nextFloat();
            double x2 = sc.nextFloat();
            double y2 = sc.nextFloat();
            double x0 = sc.nextFloat();
            double y = (y1-y2)/(x1-x2)*x0+(x1*y2-x2*y1)/(x1-x2);
            System.out.println(String.format("%.1f",y));
        }
    }
}
