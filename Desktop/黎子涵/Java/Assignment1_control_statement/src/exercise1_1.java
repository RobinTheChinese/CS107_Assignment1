import java.util.Scanner;

public class exercise1_1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] List = new int[num];
        for(int i=0;i<=num-1;i++){
            List[i] = sc.nextInt();
        }
        for(int i : List){
            switch (i){
                case 1:
                    System.out.println("yes");
                    break;
                case 3:
                    System.out.println("yes");
                    break;
                case 5:
                    System.out.println("yes");
                    break;
                case 7:
                    System.out.println("yes");
                    break;
                case 8:
                    System.out.println("yes");
                    break;
                case 10:
                    System.out.println("yes");
                    break;
                case 12:
                    System.out.println("yes");
                    break;
                default:
                    System.out.println("no");
            }
        }
    }
}
