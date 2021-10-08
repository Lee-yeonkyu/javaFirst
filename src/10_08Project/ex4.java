class Persons { }
class Students extends Persons { }
class Researcher extends Persons { }
class Professor extends Researcher { }
public class ex4 {
    static void print(Persons p) {
        if(p instanceof Persons)
            System.out.print("Person ");
        if(p instanceof Students)
            System.out.print("Student ");
        if(p instanceof Researcher)
            System.out.print("Researcher ");
        if(p instanceof Professor)
            System.out.print("Professor ");
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.print("new Student() ->\t"); print(new Students());
        System.out.print("new Researcher() ->\t"); print(new Researcher());
        System.out.print("new Professor() ->\t"); print(new Professor());
    }
}
