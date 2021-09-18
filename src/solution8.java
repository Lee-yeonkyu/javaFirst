import java.util.Random;
import java.util.Scanner;

public class solution8 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.print("정수 몇개? ");
        int n = a.nextInt();
        int [] unit = new int[n];
        Random rd = new Random();
        rd.setSeed(System.currentTimeMillis());
        int b,c;
        for(int j=0;j<n;){
            unit[j]=(rd.nextInt(100)+1);
            for(b=0,c=0; b<j;b++){
                if(unit[j]==unit[b])
                    c=1;break;
            }
            if(c==0)
                j=j+1;
        }
        for(int x=0;x<unit.length;x++){
            System.out.print(unit[x]+" ");
            if(x!=0&&x%10==0)
                System.out.println();
        }

    }
}
