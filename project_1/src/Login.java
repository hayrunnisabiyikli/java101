import java.util.Scanner;
public class Login {
    public static void main(String[] args){
        String userName, password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Username: ");
        userName = inp.nextLine();

        System.out.print("Password: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Login Sucs !");
        }

    }
}
