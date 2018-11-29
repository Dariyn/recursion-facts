import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number for calculating its factorial");
        int user = scan.nextInt();
        scan.close();
        factorial fact = new factorial(user);
        System.out.println(fact.facts(user));
    }
}