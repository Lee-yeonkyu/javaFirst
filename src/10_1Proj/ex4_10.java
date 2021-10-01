class Sample {
    public int a;
    public int b; //실행을 위해 public으로 변경함.
    int c;
}
public class ex4_10 {
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a = 10;
        aClass.b = 10;
        aClass.c = 10;
    }
}