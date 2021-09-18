import java.util.Scanner;

public class solution14 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String course [] = {"Java","C++","HTMLS","컴퓨터구조"
                ,"안드로이드"};
        int score[] = {95,88,76,62,55};
        String name;
        int a =0;
        for(int i=0;true;i++)
        {
            System.out.print("과목 이름>>");
            name = scanner.next();
            if("그만".equals(name))
                break;

            for(int j=0;j<5;j++)
            {
                if(course[j].equals(name))
                {
                    int n = score[j];

                    System.out.println(course[j]+"의 점수는"+score[j]);
                    a = 1;
                }

            }
            if(a==0)
                System.out.println("없는 과목입니다.");


        }




    }

}
