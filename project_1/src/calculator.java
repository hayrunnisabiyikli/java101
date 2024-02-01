import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        double n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        n1 = input.nextInt();
        System.out.print("Enter second number: ");
        n2 = input.nextInt();

        System.out.println("1-Addition\n2-Subtraciton\n3-Multiplication\n4-Division");
        System.out.print("Select one of them: ");
        select = input.nextInt();

        if (select == 1) {
            System.out.println("Addition : " + (n1 + n2));
        } else if (select == 2) {
            System.out.println("Subtraciton : " + (n1 - n2));
        } else if (select == 3) {
            System.out.println("Multiplication : " + (n1 * n2));
        } else if (select == 4) {
            if (n2 != 0) {
                System.out.println("Division : " + (n1 / n2));
            } else {
                System.out.println("This number is not divide with 0 !");
            }
        } else {
            System.out.println("Wrong selection. Try again.");
        }
    }
}
