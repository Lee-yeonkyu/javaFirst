public class sol2 {
    private int x, y, radius;

    public sol2(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public String toString() {
        return "Circle("+x+","+y+")반지름"+radius;
    }

    public boolean equals(Object obj) {
        sol2 p = (sol2)obj;
        if(p.x == x && p.y == y) //중심이 같으면 같은 원이다.
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        sol2 a = new sol2(2, 3, 5); // 중심 (2, 3)에 반지름 5인 원
        sol2 b = new sol2(2, 3, 30); // 중심 (2, 3)에 반지름 30인 원
        System.out.println("원 a : " + a);
        System.out.println("원 b : " + b);
        if(a.equals(b))
            System.out.println("같은 원");
        else
            System.out.println("서로 다른 원");
    }
}