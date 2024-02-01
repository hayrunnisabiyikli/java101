import java.util.Scanner;
public class pass {
        public static void main(String[] args) {
            double math, physics, chemical, biology, turkish, history;

            Scanner inp = new Scanner(System.in);

            System.out.print("Grade of Math: ");
            math = inp.nextInt();

            System.out.print("Grade of Physics: ");
            physics = inp.nextInt();

            System.out.print("Grade of Chemical: ");
            chemical = inp.nextInt();

            System.out.print("Grade of Biology: ");
            biology = inp.nextInt();

            System.out.print("Grade of Turkish: ");
            turkish = inp.nextInt();

            System.out.print("Grade of History: ");
            history = inp.nextInt();

            double avarage = (math + physics +chemical + biology + turkish + history)/6;
            if (avarage <= 55){
                System.out.println("You fail. See you later nex year! ");
            }else{
                System.out.println("Congrats, you pass!");
        }
            System.out.println("GPA: " + avarage);
    }
}
