import java.util.Scanner;

public class gpa {
    public static void main(String[] args) {
        int math, physics, chemical, biology, turkish, history;

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

        int toplam = (math + physics +chemical + biology + turkish + history);
        double sonuc = toplam/6;
        System.out.println("GPA: " + sonuc);
    }
}
