public class ex4 {
    String title;
    String author;
    public ex4(String t) { // 생성자
        title = t; author = "작자미상";
    }
    public ex4(String t, String a) { // 생성자
        title = t; author = a;
    }
    public static void main(String [] args) {
        ex4 littlePrince = new ex4("어린왕자", "생텍쥐페리");
        ex4 loveStory = new ex4("춘향전");
        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);
    }
}