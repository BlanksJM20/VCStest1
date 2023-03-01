import java.util.Scanner;

public class HelloWorld {
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = console.next();
        System.out.println("Hello " + name);
        System.out.println("Commit test two");
    }
}
