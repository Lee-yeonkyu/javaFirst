import java.util.Scanner;

public class solution4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("소문자 알파벳 하나를 입력하시오>> ");
        char name = a.next().charAt(0);
        char x = 'a';
        for(char y=name;y>='a';y--){
            x='a';
            do {
                System.out.print(x);
                x = (char) (x + 1);
            } while (x<=name);
            System.out.println(" ");
            name=(char)(name-1);
        }
    }
}
