import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] YearList = new int[2001];
        for (int i = 0; i <= 2000; i++) {
            if (i % 4 == 0) {
                YearList[i] = 1;
            }
        }
        for (int i = 0; i <= 2000; i++) {
            if (i % 100 == 0) {
                YearList[i] = 0;
            }
        }
        for (int i = 0; i <= 2000; i++) {
            if (i % 400 == 0) {
                YearList[i] = 1;
            }
        }
        for(int i=1;i<=num;i++){
            int year = sc.nextInt();
            if(YearList[year]==0){
            System.out.println("No");
            }else{
                System.out.println("Yes");
                int Result = 0;
                for(int j=year+1;j<=1999;j++){
                    if(YearList[j]==1){
                        Result++;
                    }
                }
                Result += 307+365*(1999-year);
                System.out.println(Result);
            }
        }
    }
}