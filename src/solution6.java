import java.util.Scanner;

public class solution6 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("금액을 입력하시오>> ");
        int sum = a.nextInt();

        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};

        for(int i=0;i<unit.length;i++){
            int n = 0;
            do {
                if (sum - unit[i] >= 0) {
                    sum = sum - unit[i];
                    n++;
                }
            }while(sum-unit[i]>=0);
            System.out.println(unit[i]+"원 짜리 : "+n+"개");
        }


    }
}
