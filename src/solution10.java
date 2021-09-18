
public class solution10 {
    public static void main(String [] args){
        int array[][] = new int[4][4];
        int n1=0,n2=0;

        for(int i=0;i<array.length;i++)
            for(int j=0;j<array[i].length;j++)
                array[i][j]=(int)(Math.random() * 10+1);
        int count =1;
        while(count<7) {
            n1 = (int)(Math.random()*3);
            n2 = (int)(Math.random()*3);

            if(array[n1][n2] != 0){
                array[n1][n2]=0;
                count++;
            }
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++)
                System.out.print(array[i][j]+" ");
            System.out.println();
        }

    }
}
