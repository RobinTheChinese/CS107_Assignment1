import java.util.ArrayList;
import java.util.Scanner;
public class exercise1 {
    public static void main(String[]args){
        ArrayList<Integer> AimList =new ArrayList<>();
        AimList.add(1);AimList.add(3);AimList.add(5);AimList.add(7);AimList.add(8);AimList.add(10);AimList.add(12);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] List = new int[num];
        for(int i=0;i<=num-1;i++){
            List[i] = sc.nextInt();
        }
        for(int i=0;i<=num-1;i++){
            boolean Result = AimList.contains(List[i]);
            if(Result){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
