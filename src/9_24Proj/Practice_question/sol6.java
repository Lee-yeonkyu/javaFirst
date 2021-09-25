import java.util.Scanner;
class Circle{
    double x,y;
    int radius;
    public Circle(double x, double y, int radius){
        this.radius=radius;
        this.x=x;
        this.y=y;
    }
    public void show(){
        System.out.println("("+x+","+y+")"+radius);
    }
    public int getRadius(){
        return radius;
    }
}
public class sol6 {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        Circle c[] = new Circle[3];
        int max=0;
        for(int i=0; i < c.length; i ++) {
            System.out.print("x, y, radius >>");
            double x = sc1.nextDouble(); // x값 읽기.
            double y = sc1.nextDouble(); // y값 읽기.
            int radius = sc1.nextInt(); // radius값 읽기.
            c[i] = new Circle(x, y, radius); // Circle 객체 생성
        }
        for(int i=0;i<c.length;i++)
            if(max<c[i].getRadius())
                max = c[i].getRadius();
        for(int i=0;i<c.length;i++)
            if(max == c[i].getRadius()){
                System.out.print("가장 면적이 큰 원은 ");
                c[i].show();
            }
        sc1.close();
    }
}
